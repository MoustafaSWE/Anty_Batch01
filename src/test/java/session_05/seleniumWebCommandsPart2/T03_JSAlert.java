package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class T03_JSAlert {

    public static void main(String[] args)throws Exception {
        WebDriver driver;

        driver = new ChromeDriver();
        JavascriptExecutor Js =(JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        WebElement element=driver.findElement(By.cssSelector("a[title='Show details for Apple MacBook Pro 13-inch']"));




    }
}
