package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/abtest");

        // String text = driver.findElement(By.id("content")).getText();
        // String text = driver.findElement(By.className("example")).getText();
       //String text = driver.findElement(By.cssSelector("div[id=\"content\"] p")).getText();
      String text = driver.findElement(By.xpath("//div[@id=\"content\"]")).getText();
      System.out.println(text);

    }
}
