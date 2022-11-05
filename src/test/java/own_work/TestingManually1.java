package own_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestingManually1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("lang=en-GB");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        /*
        // identify "I'm Feeling Lucky" element and save the element
      WebElement luckyText = driver.findElement(By.id("RNmpXc"));

      // find value of attribute
      String text = luckyText.getAttribute("value");

      // verify if value is "I'm Feeling Lucky"
      if (text.equals("I'm Feeling Lucky")) {
          System.out.println("TEST PASSED");
      } else {
          System.out.println("TEST FAILED");
      }
         */

                      /*
        //find by name
       // identify and save the search box element
         WebElement searchBox = driver.findElement(By.name("q"));

       // enter text "selenium"
       searchBox.sendKeys("selenium" + Keys.ENTER);

        // close the browser  */
                   /*
        // wrong address
        //find element by className

        WebElement SignIn = driver.findElement(By.name("gb_1 gb_2 gb_8d gb_8c"));

        if (SignIn.getTagName().equals("Sign in")) {
            System.out.println("Button is working");
        } else {
            System.out.println("Button is not working");
        }
                     */
            /*
          // navigate to http://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        // identify and save the "Test Automation Practice" element
        WebElement text = driver.findElement(By.tagName("h1"));

        // print out the text
        System.out.println(text.getText());

        //close the browser
              */
        

    }
}
