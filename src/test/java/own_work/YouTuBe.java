package own_work;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YouTuBe {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.youtube.com/");

            String input = "//input[@id='search']";
            String searchButton = "//button[@id='search-icon-legacy']";
            String firstVideo = "Eminem - Lose Yourself [HD]";
            String videoTitle = "//h1[@class='title style-scope ytd-video-primary-info-renderer']";

            Thread.sleep(3000);
            WebElement searchInput = driver.findElement(By.xpath(input));
            searchInput.sendKeys("eminem");

            WebElement buttonSearch = driver.findElement(By.xpath(searchButton));
            buttonSearch.click();
            Thread.sleep(3000);

            WebElement video = driver.findElement(By.linkText(firstVideo));
            video.click();
            Thread.sleep(3000);

            WebElement title = driver.findElement(By.xpath(videoTitle));
            System.out.println(title.getText());

            

            driver.quit();
        }
    }



