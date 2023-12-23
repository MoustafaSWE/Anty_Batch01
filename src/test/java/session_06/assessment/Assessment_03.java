package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Assessment_03 {
            /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Invalid password: secret_sauce
        4. Click on Login button
        5. Click on Add to cart button, for the first product
    Expected Result:
        1. Assert that you are on this URL: https://www.saucedemo.com/v1/inventory.html
        2. Assert that after clicked on Add to cart button, it changed to Remove
        3. Assert that Cart displayed number 1, after adding one product to cart
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions
                .elementToBeClickable(driver
                        .findElement(By.id("login-button")))).click();
        driver.findElements(By.cssSelector("button[class=\"btn_primary btn_inventory\"]")).get(0).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html"));
        By remove = By.cssSelector("button[class=\"btn_secondary btn_inventory\"]");
        String text = driver.findElement(remove).getText();
        Assert.assertTrue(text.equals("REMOVE"));
        int numberOfItemsInCart = driver.findElements(remove).size();
        Assert.assertEquals(numberOfItemsInCart,1);
        System.out.println(numberOfItemsInCart);
    }
}
