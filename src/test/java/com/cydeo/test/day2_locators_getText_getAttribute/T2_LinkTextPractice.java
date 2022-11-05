package com.cydeo.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("lang=en-GB");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practice.cydeo.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //driver.findElement(By.linkText("A/B Testing)).click();
        //WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        WebElement abTestLink = driver.findElement(By.partialLinkText("A/B"));
        abTestLink.click();

        Thread.sleep(2000);

        //4 - Verify title is: Expacted: No A/B Test
        String expectedTitle = "No A/b Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals((expectedTitle))) {
            System.out.println("No A/B test title verification passed!");
        } else {
            System.out.println("No A/B test title verification failed!");
        }

        // 5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals: Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals((expectedTitle))) {
            System.out.println("Practice page title verification passed!");
        } else {
            System.out.println("Practice page title verification failed!");
        }

        /*
            #3. name:
            - It uses "name" attribute's value to locate web element
            - it will go thorough HTML code and find matching "name" attribute value, and return the first matchin gweb element
            - name locator does not have to be unique

            Ex: <div name="hu58"> </div>

            syntax: driver.findElement(By.name("hu58"))
         */



        //driver.findElement(By.linkText("CYDEO")).click();

        //Thread.sleep(2000);

        //driver.findElement(By.linkText("mega-menu-link")).click();


    }
}
