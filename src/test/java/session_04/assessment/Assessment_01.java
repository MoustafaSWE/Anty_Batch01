package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Assessment_01 {

    /*
        TestCase:
            1.scroll down to nop commerce */
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.navigate().to("https://www.nopcommerce.com/en");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");

        WebElement buttonnn = driver.findElement(By.cssSelector("a[class='btn black-border-button']"));
        Actions actions =new Actions(driver);
        actions.moveToElement(buttonnn).click();
      // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      //  js.executeScript("window.scrollTo(0, document.body.scrollTop)");


    }
}