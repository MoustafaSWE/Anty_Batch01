package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();

        String rgbColor = driver.findElement(By.id("flash")).getCssValue("background-color");
        System.out.println(rgbColor);

        String hexColor = Color.fromString(rgbColor).asHex();
        System.out.println(hexColor);





    }
}
