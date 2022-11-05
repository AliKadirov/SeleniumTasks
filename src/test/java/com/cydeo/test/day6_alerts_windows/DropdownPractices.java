package com.cydeo.test.day6_alerts_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdownTask4() throws InterruptedException {
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        selectState.selectByVisibleText("Illinois");

        Thread.sleep(3000);
        //4. Select Virginia
        selectState.selectByValue("VA");

        //5. Select California
        selectState.selectByIndex(5);

        //6. Verify final selected option is California.
        String actualResult = selectState.getFirstSelectedOption().getText();
        String expectedResult = "California";

        Assert.assertEquals(actualResult, expectedResult, "Final selected option verification is failed!");

       // for (Object o :) {}       iter + enter = shortcut

        // finding index number from options
        int index = -1;
        for (WebElement eachState : selectState.getOptions()) {
            index++;
            if (eachState.getText().equals("California")){
                System.out.println(index);
            }
        }


    }

    @AfterMethod
    public void tearDownMethod() {
       // driver.quit();
    }

    @Test
    public void dropdownTask7() throws InterruptedException {

        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        // 3. Select all the options from multiple select dropdown
        // 4. Print out all selected values
        for (WebElement eachLanguage : selectLanguage.getOptions()){
            eachLanguage.click();
            System.out.println("eachLanguage.getText() = " + eachLanguage.getText());
        }

        Thread.sleep(3000);
        // 5. Deselect all values
        selectLanguage.deselectAll();
    }

    


}
