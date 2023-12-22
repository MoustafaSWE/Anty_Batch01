package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.TAB+"secret_sauce"+Keys.ENTER);
        WebElement addToCart =  driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"][1]"));
        addToCart.click();
        WebElement remove =  driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"][1]"));
        String text = remove.getText();
        Assert.assertEquals(text,"REMOVE");
        



    }
}
