package session_03.firstAutomationScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstAutomationScript {

    public static void main(String[] args) {
        WebDriver driver ;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://staging.dealapp.sa/auth/login;logout=true");
        driver.findElement(By.cssSelector("input[class='native-input sc-ion-input-ios']")).sendKeys("500844666");
        driver.findElement(By.id("nextBtn")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("otc-1")).sendKeys("1");
        driver.findElement(By.id("otc-2")).sendKeys("1");
        driver.findElement(By.id("otc-3")).sendKeys("2");
        driver.findElement(By.id("otc-4")).sendKeys("2");
        driver.findElement(By.id("validateBtn")).click();











    }


}
