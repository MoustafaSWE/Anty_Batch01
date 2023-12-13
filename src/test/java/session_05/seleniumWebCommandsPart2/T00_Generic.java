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

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");

        Actions actions = new Actions(driver);

        WebElement columnA = driver.findElement(By.id("column-a"));
        WebElement columnB = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(columnA, columnB).perform();


    }
}
