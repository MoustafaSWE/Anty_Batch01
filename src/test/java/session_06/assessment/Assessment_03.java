package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assessment_03 {
            /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter valid password: secret_sauce
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
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("standard_user");
        driver.findElement(By.id("login-button")).click();
        WebElement actualResult = driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"][1]"));
        actualResult.click();
        WebElement expectedResult = driver.findElement(By.cssSelector("button[class=\"btn_secondary btn_inventory\"]"));
        Assert.assertEquals(actualResult,"expectedResult");
        WebElement addednumber0 = driver.findElement(By.id("shopping_cart_container"));
        WebElement addedNewElement = driver.findElement(By.cssSelector("span[class=\"fa-layers-counter shopping_cart_badge\"]"));
        Assert.assertEquals(addednumber0,"addedNewElement");

    }
}
