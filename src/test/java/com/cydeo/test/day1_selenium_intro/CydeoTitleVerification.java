package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {
    public static void main(String[] args) {

        // 1 Open chrome browser
        // 1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2 
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 3.
        driver.get("https://cydeo.com");
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED ");
        } else {
            System.out.println("Title verification is FAILED");
        }

        driver.quit();


    }
}
