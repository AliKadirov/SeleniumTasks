package com.cydeo.test.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //   1. Go to http://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkBox2 = driver.findElement(By.id("box2"));

        //   2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected(), excepting false " + checkBox1.isSelected());

        //   3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected(), excepting true " + checkBox2.isSelected());

        //   4. Click checkbox #1 to select it.
        Thread.sleep(5000);
        checkBox1.click();

        //   5. Click checkbox #2 to deselect it.
        Thread.sleep(5000);
        checkBox2.click();

        //   6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(), excepting true " + checkBox1.isSelected());

        
        //   7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected(), excepting false " + checkBox2.isSelected());
    }
}
