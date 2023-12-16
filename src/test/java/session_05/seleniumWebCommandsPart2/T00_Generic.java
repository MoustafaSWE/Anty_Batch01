package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import javax.xml.bind.Element;
import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By
                .cssSelector("div[class=\"picture\"] a[href=\"/apple-macbook-pro-13-inch\"]"));
        js.executeScript("arguments[0].scrollIntoView();", element);


    }
}
