package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T04_DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement columA = driver.findElement(By.id("column-a"));
        WebElement columB =driver.findElement(By.id("column-b"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(columA));
        Actions actions= new Actions(driver);
        actions.dragAndDrop(columA, columB).perform();



    }
}
