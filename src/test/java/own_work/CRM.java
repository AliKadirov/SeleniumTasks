package own_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://login1.nextbasecrm.com/auth/?backurl=%2Fstream%2F");
        driver.manage().window().maximize();

        WebElement userLogin = driver.findElement(By.name("USER_LOGIN"));
        userLogin.sendKeys("helpdesk61@cydeo.com");

        Thread.sleep(500);
        WebElement userPassword = driver.findElement(By.name("USER_PASSWORD"));
        userPassword.sendKeys("UserUser" + Keys.ENTER);

        Thread.sleep(500);

        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.className("menu-popup-item-text")).click();

        driver.navigate().back();


        



    }
}
