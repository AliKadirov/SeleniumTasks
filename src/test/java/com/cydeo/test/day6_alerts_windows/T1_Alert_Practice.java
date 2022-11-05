package com.cydeo.test.day6_alerts_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }


    @Test
    public void alertTask1() {
        // 3. Click to "Click for JS Alert" button
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        // 4. Click to OK button from the alert
        // To handle JS alerts we have to use Alert
        Alert alert = driver.switchTo().alert();
        // accept() method will click OK button
        alert.accept();

        // 5. Verify “You successfully clicked an alert” text is displayed.
        String actualResult = "You successfully clicked an alert";
        WebElement expectedResult = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(expectedResult.isDisplayed());

        

 //       Assert.assertEquals(actualResult,expectedResult,"Word is not matching");


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
