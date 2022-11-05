package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LibraryVerifications {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("lang=en=GB");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://library2.cydeo.com/login.html");
        driver.manage().window().maximize();

        //3. Enter username: "incorrect.gmail.com"
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("testing@gmail.com");



        WebElement userPassword = driver.findElement(By.id("inputPassword"));
        userPassword.sendKeys("asdasdas123");


       //5. Click to Sign in button
       WebElement signInButton = driver.findElement(By.tagName("button"));
       signInButton.click();




        



    }


}
