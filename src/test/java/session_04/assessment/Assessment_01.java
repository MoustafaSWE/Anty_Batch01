package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_01 {

    /*
        TestCase:
            1. Go to URL: https://www.cazoo.co.uk/

            2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "Audi A1 1.4 TFSI S line Sportback S Tronic"
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.cazoo.co.uk/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[class='cui__sc-mqi3p7-0 fuyLT']")))).click();
        Select selectfromdropdownnamemake = new Select(driver.findElement(By.cssSelector( "select[name='make']")));
        selectfromdropdownnamemake .selectByValue("audi");
        Select select2 = new Select(driver.findElement(By.cssSelector( "select[name='model']")));
        selectfromdropdownnamemake .selectByValue("a1");
        driver.findElement(By.cssSelector("button[type='submit']")).click();



    }
}