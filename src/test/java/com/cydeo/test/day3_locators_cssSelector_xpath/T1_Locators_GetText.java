package com.cydeo.test.day3_locators_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_GetText {
    /*
    Difference between click and submit method?
    -   click() - Perform only click operation as link mouse click
    -   submit() - perform Enter operation as like keyboard Enter event

    - .sendKeys("Send Text");
    What does it do?
    - It will pass the provided string into given element

    - Does it accept argument?
     - It will pass




     -  .getText();
     - What does it do?
      - It will take the content from in between opening and closing tag

      - What is the return type?
       - String

       - Does it accept any argument?
        - No

        syntax: We can not say driver.getText()
            driver.findElement(BY.locator("")).getText()

            Ex:
            <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

            driver.findElement(By.id("sjdg65")).getText() --> TESLA CYBERTRUCK

        - .getAttribute("Attribute name");
            - What does it do?
                - find the matching attribute and returns its value

           - What is the return type?
            - String

           - Does it accept any argument?
            - It accepts String arg

                Ex:
            <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

            - driver.findElement(By.id("sjdg65")).get.Attribute("href") --> https://tesla.com
            - driver.findElement(By.id("sjdg65")).get.Attribute("name") -->  uhs97
            - driver.findElement(By.id("sjdg65")).get.Attribute("class") --> hsjd98
            - driver.findElement(By.id("sjdg65")).get.Attribute("id") -->  sjdg68

   LOCATORS:
        - How many total locators we have?
            - 8 locators:
              - id
              - name
              - className
              - linkText
              - partialLinkText
              - tagName
              - cssSelector
              - xpath

   1 - id:
        - It will find and return web element that has matching id attribute value
        - "id" is always unique

   Ex:
            <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>
            driver.findElement(By.id("sjgd68"))

   2 - name:
        -It will find and return web element that has first matching "name" attribute value
        - "name" is NOT always unique

         <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>
            driver.findElement(By.id("sjgd68"))

        driver.findElement(By.name("uhs67"));

   3 -className:
        -It will find and return web element that has first matching "className" attribute value
        - "name" is NOT always unique

        <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

            driver.findElement(By.className("hsjd98"));

   4 - linkText
        - It will look through of the LINKS in theHTML page and return first matching result
        - It ONLY ONLY ONLY works with links (<a> tag)
        - it works similar to .equals() methods in java
        - it is looking for EXACT String match

        <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

         driver.findElement(By.linkText("TESLA CYBERTRUCK"));

   5 - partialLinktext
        - It will look through of the LINKS in theHTML page and return first matching result
        - It ONLY ONLY ONLY works with links (<a> tag)
        - it works similar to .equals() methods in java
        - it is looking for PARTIAL String match

        <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

        - driver.findElement(By.partialLinkText("TESLA CYBERTRUCK"))
            - driver.findElement(By.partialLinkText("TESLA")
            - driver.findElement(By.partialLinkText("CYBERTRUCK"))
            - driver.findElement(By.partialLinkText("ESLA"))

    6 - tagName:
        - This locator locates using given TAG NAME
        - We pass the TAG name as String parameter
        - It will find and return first matching result

        <a href="https://tesla.com" name="uhs67" class="hsjd98" id="sjgd68"> TESLA CYBERTRUCK </a>

        driver.findElement(By.tagName("a");

            1- Open a chrome browser
            2- Go to: https://login1.nextbasecrm.com/
            3- Enter incorrect username: “incorrect”
            4- Enter incorrect password: “incorrect”
            5- Click to login button.
            6- Verify error message text is as expected:
            Expected: Incorrect login or password

     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorract@gmail.com");

        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));// alt + enter: ShortCut
        userPassword.sendKeys("user12345");

        WebElement element = driver.findElement(By.className("login-btn"));
        element.click();


        WebElement errorText = driver.findElement(By.className("errortext"));
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorText.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification passed");
        }else {
            System.out.println("Error message verification failed");
        }

        driver.close();

    }
}
