package own_work;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class VyTruck extends TestBase {

    @Test
    public void vyTruck() throws InterruptedException, AWTException {
        driver.get("https://qa1.vytrack.com/user/login");

        WebElement userInput = driver.findElement(By.id("prependedInput"));
        userInput.sendKeys("user44");

        WebElement userPassword = driver.findElement(By.id("prependedInput2"));
        userPassword.sendKeys("UserUser123");

        WebElement userLogin = driver.findElement(By.id("_submit"));
        userLogin.click();

        Thread.sleep(1000);
        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();

        Thread.sleep(2000);
        WebElement vehicles = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        vehicles.click();

        Thread.sleep(5000);
        WebElement threeDot = driver.findElement(By.xpath("(//div[@class='dropdown']/a)[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(threeDot).perform();
        Thread.sleep(5000);
       


    }

}
