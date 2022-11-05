package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*


public static WebDriver getDriver(String browserType) {

if (browserType.equals("chrome")) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
return driver;

} else if (browserType.equals("firefox")) {
WebDriverManager.firefoxdriver().setup();
WebDriver driver = new FirefoxDriver();
return driver;
}


}
*/
 /*   public static WebDriver getDriver(String browserType) {

        if (browserType.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browserType.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        return WebDriver;
    }

  */

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("lang=en-GB");
            return new ChromeDriver(options);

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type doesn't exist or not currently support!");
            return null;
        }
    }

    public static void main(String[] args) {
        getDriver("chrome").get("https://www.google.com");


    }
}
