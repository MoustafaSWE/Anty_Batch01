package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
       WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("[href='/abtest']")).click();
        String text =driver.findElement(By.cssSelector("div[class=\"example\"] p")).getText();
        System.out.println(text);


    }

}
