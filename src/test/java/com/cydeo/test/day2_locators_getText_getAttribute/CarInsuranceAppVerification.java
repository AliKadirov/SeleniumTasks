package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");


        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.qa1.excelsoirinsurance.com/login");
        driver.manage().window().maximize();

        String expectedURl = "excelsoirinsurance"; // comes from req
        String actualURl = driver.getCurrentUrl(); // comes from browser


        if (actualURl.contains(expectedURl)) {
            System.out.println("URL verification is PASSED");
        } else {
            System.out.println("URL verification is FAILED");
        }

        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is passed!");
        } else {
            System.out.println("Title verification is failed!");
        }


        driver.quit();

        /*
        Note

        To be able to do any action on any web element, there are some certain steps we have to follow:
            #1. We have to locate the web element that we want to work
            #2. To locate we have to use a set of methods coming from Selenium library
                    - findElement()
                    - locator methods
            #3. We decide what action we want to apply, find the method, and use it on the already located web element
                    - click

                - .findElement();
            1. This method finds and returns Single web element
            2. it accepts a locator argument, and finds the requested web element using locator
            3. Return type: WebElement type (comes from Selenium library)
            4. It will throw "NoSuchElementException"
                - if you provide a wrong locator
                - if your page does not lead as fast as it should

            - What is a locator?
                - Locators help us located web elements using Selenium WebDriver.
                - Locators are basically 8 methods coming from selenium library

                - There are total 8 locators
                - We will learn 6 of them

            #1. linkText:
                - this locator will work through the text of all the links in the page, and return matching link
                - It accepts a string as the text of the link we are trying to locate
                - it will ONLY ONLY ONLY works on links <a> anchor tags
                - This method looks for exact text match
                - it is similar to .equal method from java
                - it will search through HTML code and return first matching result

                EX: <a href = "https://facebook.com"> Facebook </a>
                    driver.findElement(By.linkText("Facebook")
         */
    }
}
