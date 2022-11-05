package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getText_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        // Locate with using cssSelector by type attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));


        // Locate with using cssSelector by value attribute
        //  WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));


        // Locate with using cssSelector by class attribute
        // WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));


        // Locate with using cssSelector by class attribute with syntax #2
        //WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));

        // Locate with using cssSelector by onclick attribute
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick='BX.addClass(this, 'wait');']"));

    }
}
