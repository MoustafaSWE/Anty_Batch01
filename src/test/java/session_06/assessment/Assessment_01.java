package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Assessment_01 {

    /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Invalid password: standard_user
        4. Click on Login button
    Expected Result:
        1. Assert that this message is displayed: "Username and password do not match any user in this service"
        2. Assert that logo displayed beside error message, it's color match Hex Color: #f0000
        3. Assert that you are not on this URL: https://www.saucedemo.com/v1/inventory.html
     */

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Open URL: https://www.saucedemo.com/v1/
        driver.navigate().to("https://www.saucedemo.com/v1/");

        // 2. Enter Valid username: standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // 3. Enter Valid Password: secret_sauce
        driver.findElement(By.id("password")).sendKeys("standard_user");

        // 4. Click On Login
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions
                        .elementToBeClickable( driver
                                .findElement(By.id("login-button"))))
                .click();
         String errorMess = driver.findElement(By.cssSelector("h3[data-test=\"error\"])")).getText();



    }
}
