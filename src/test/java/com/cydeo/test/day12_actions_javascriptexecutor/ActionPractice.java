package com.cydeo.test.day12_actions_javascriptexecutor;

import com.beust.ah.A;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionPractice {

    @Test
    public void task_4_and_5_test() throws InterruptedException {
        //  1- Open a chrome browser
        //  2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //  Create an Actions object to use methods coming from Actions class
        Actions actions = new Actions(Driver.getDriver());

        //  4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        Thread.sleep(1500);

        actions.moveToElement(cydeoLink).perform();

        BrowserUtils.sleep(3);

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();


    }
}
