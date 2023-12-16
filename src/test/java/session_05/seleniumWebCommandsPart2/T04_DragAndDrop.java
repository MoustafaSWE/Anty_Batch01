package session_05.seleniumWebCommandsPart2;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T04_DragAndDrop {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement colunaA = driver.findElement(By.id("column-a"));
        WebElement colunaB = driver.findElement(By.id("column-b"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(colunaA));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(colunaA,colunaB).perform();



    }
}
