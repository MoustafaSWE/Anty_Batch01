package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/abtest");

        String actualText = driver.findElement(By
                .cssSelector("div[class=\"example\"] h3"))
                .getText();

        Assert.assertTrue(actualText.contains("A/B"));

        driver.quit();




    }
}
