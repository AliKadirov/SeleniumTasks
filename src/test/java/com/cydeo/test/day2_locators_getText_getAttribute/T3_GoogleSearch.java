package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //1- open a Chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");
        WebDriver driver = new ChromeDriver(options);

        //2- Go to: google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();


        //3- Write "apple" in search box
        //4- use Keys.Enter to search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);


        //5- Verify title: Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        driver.close();

        /*
            #6. tagName:
                - it will find and return the first matching tag provided.
                - this locator doesn't have many use cases unless either the page uis very simple or we are trying to get a group of web elements using findElements method

                Ex: <div class="asd87"> </div>

                Syntax: driver.findElement(By.
         */

    }
}
