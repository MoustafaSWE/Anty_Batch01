package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class Assessment_01 {

    /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Invalid password: standard_user
        4. Click on Login button

    Expected Result:
        1. Assert that this message is displayed: "Username and password do not match any user in this service"
        2. Assert that logo displayed beside error message, it's color match Hex Color: #f00
        3. Assert that you are not on this URL: https://www.saucedemo.com/v1/inventory.html
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // 3. Enter Valid Password: secret
        driver.findElement(By.id("password")).sendKeys("studerd_user");
        // 4. Click On Login
        driver.findElement(By.id("login-button")).click();
        String message = driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();

        String rgbColor = driver.findElement(By.cssSelector("button[class=error-button]")).getCssValue("color");
        String hexColor = Color.fromString(rgbColor).asHex();


        Assert.assertEquals(message, "Epic sadface: Username and password do not match any user in this service");
        Assert.assertEquals(hexColor, "#ff0000");
        Assert.assertFalse(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html"));

       driver.quit();
    }
}
