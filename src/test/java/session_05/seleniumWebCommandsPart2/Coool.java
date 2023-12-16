package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Coool {
    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword! ");
        driver.findElement(By.className("radius")).click();
        String rgbColor =driver.findElement(By.id("flash")).getCssValue("background");
        System.out.println(rgbColor);
        String hexColor = Color.fromString(rgbColor).asHex();
        System.out.println(hexColor);
    }
}
