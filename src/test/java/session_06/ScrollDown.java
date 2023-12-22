package session_06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("div[class=\"picture\"] a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).getText();


       /*WebDriver driver;
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement Element = driver.findElement(By.cssSelector("div[class=\"picture\"] a[href=\"/electronics\"]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        */
    }
}

