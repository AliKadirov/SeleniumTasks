package com.cydeo.test.day9_properties_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {


    @Test
    public void crm_login_test() throws InterruptedException {
        //  1. Create new test and make setups
        //  2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");


        //  3. Enter valid username
        // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hr2@cydeo.com");
        WebElement userInput = driver.findElement(By.xpath("//input[@type='text']"));
        userInput.sendKeys("hr2@cydeo.com");

        //  4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");

        //  5. Click to Log In button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();

        Thread.sleep(5000);

        //  6. Verify title is as expected: Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }

    @Test
    public void crm2_login_test_2(){

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver);

        BrowserUtils.verifyTitle(driver, "Portal");


    }

    @Test
    public void crm_login_test_3(){

        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver, "hr3@cydeo.com","UserUser");

        BrowserUtils.verifyTitle(driver, "(1) Portal");
    }

}
