package com.cydeo.test.day6_alerts_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/windows ");
    }


    @Test
    public void windowsTask() {

        // 4 Asser: Title is "Windows"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Before opening new window " + actualTitle);


        //5. Click to: "Click here" link
        WebElement clickHerBtn = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHerBtn.click();

        actualTitle = driver.getTitle();
        System.out.println("After opening new window " + actualTitle);

        //6. Switch to new Window.
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindows = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


        //7. Assert: Title is "New Window"
        actualTitle = driver.getTitle();
        String expectedTitleAfterClick = "New Window";

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);


    }

}
