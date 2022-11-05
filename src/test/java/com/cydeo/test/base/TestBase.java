package com.cydeo.test.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

// This class is the parent of all Test classes
// You will update this class based on what you are keep writing in your most test classes
// instead writing in all test classes, you can just write in this class, and you can extend this class from any class
public abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   //     // in your work environment you will be navigation same link, and you can still use TestBase class to navigate same page for all test classes
   //     Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


}
