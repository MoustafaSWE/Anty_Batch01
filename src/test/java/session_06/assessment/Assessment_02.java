package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Assessment_02 {

        /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Invalid password: secret_sauce
        4. Click on Login button
    Expected Result:
        1. Assert that you are on this URL: https://www.saucedemo.com/v1/inventory.html
        2. Assert that all product contains "$" beside its price
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html"));
        for (int i=1; i<7 ; i++){
            String dollarSign = driver.findElements(By.cssSelector("div[class=\"inventory_item_price\"]")).get(i).getText();
            Assert.assertTrue(dollarSign.contains("$"));
            System.out.println("product" + " " + i + " " + "contains $ beside its price");
        }
    }

}
