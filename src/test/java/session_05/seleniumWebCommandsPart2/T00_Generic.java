package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import javax.xml.bind.Element;
import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args)throws Exception {
        // how to scroll down with javaScript By Actions must entre .perform to
        WebDriver driver;
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver); // le et3mlt ?
        WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/25-virtual-gift-card'][1]"));
        js.executeScript("arguments[0].scrollIntoView();", webElement1);


       // driver.navigate().to("https://admin:admin@the-internet.herokuapp.com//");








    }








}
