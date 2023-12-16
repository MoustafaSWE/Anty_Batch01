package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class T03_JSAlert {

    public static void main(String[] args) throws Exception {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
       driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
       Thread.sleep(2000);
       driver.switchTo().alert().accept();
driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
driver.switchTo().alert().dismiss();
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
driver.switchTo().alert().sendKeys("Hello");
driver.switchTo().alert().accept();
        Thread.sleep(2000);


    }
}
