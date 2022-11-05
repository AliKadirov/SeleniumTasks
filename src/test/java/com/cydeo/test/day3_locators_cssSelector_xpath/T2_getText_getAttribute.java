package com.cydeo.test.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Remember me label text verification passed!");
        } else {
            System.out.println("Remember me label text verification failed!");
        }


        WebElement forgetPs = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgetPs = "Forgot your password?";
        String actualForgetPs = forgetPs.getText();

        if (actualForgetPs.equals(expectedForgetPs)) {
            System.out.println("Forgot your password? verification passed!");
        } else {
            System.out.println("actualForgetPs = " + actualForgetPs);
            System.out.println("expectedForgetPs = " + expectedForgetPs);
            System.out.println("Forgot your password? verification failed!");
        }

        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgetPs.getAttribute("href");

        if (actualInHref.contains(expectedInHref)) {
            System.out.println("Href attribute value verification passed!");
        } else {
            System.out.println("Href attribute value verification failed!");
        }

        driver.quit();
        

        


    }

}
