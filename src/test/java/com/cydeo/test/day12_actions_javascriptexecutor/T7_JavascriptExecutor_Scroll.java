package com.cydeo.test.day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavascriptExecutor_Scroll {

    @Test
    public void task7_javascript_scroll_test(){

        // 1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

        // We have to do downCasting(typecasting) to JavascriptExecutor interface
        // for using methods coming from this interface
        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

        // Locate both "Cydeo" and "Hove" links
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));


        BrowserUtils.sleep(2);

        //3- Scroll down to “Cydeo” link
       // js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink, homeLink);

        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        BrowserUtils.sleep(2);

        //4- Scroll up to “Home” link
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);




        //5- Use below provided JS method only

        //JavaScript method to use : arguments[0].scrollIntoView(true)

        //Note: You need to locate the links as web elements and pass them
        //as arguments into executeScript() method

    }
}
