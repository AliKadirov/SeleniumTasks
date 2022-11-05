package com.cydeo.test.day6_alerts_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/iframe");


    }

    @Test
    public void iframeTask() {
        // switch to iframe with index number
        // driver.switchTo().frame(0);

        // switch to iframe sing id value
        //driver.switchTo().frame("mce_0_ifr");

        // switch to iframe using locator
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //4. Assert "Your content goes here" Text is displayed
        WebElement textArea = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(textArea.isDisplayed());

        // If you have nested iframe and if you want to give back to parent iframe you should use parentFrame()
        // driver.switchTo().parentFrame();

        // we are switching to main html with using defaultContent()
        driver.switchTo().defaultContent();

        // 5. Assert "An iFrame containing the "TinyMCE WYSIWYG Editor" is Displayed
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }
}
