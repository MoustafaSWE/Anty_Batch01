package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class T03_JSAlert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
       /* driver.navigate().to("https://demo.nopcommerce.com/");
        WebElement Element = driver.findElement(By.xpath("(//div[@class=\"details\"])[1]"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
*/
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


        driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]")).click();
        driver.switchTo().alert().sendKeys("hadeer");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


    }
}
