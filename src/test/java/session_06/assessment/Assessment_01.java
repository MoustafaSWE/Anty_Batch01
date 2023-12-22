package session_06.assessment;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

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
        2. Assert that logo displayed beside error message, it's color match Hex Color: #f00
        3. Assert that you are not on this URL: https://www.saucedemo.com/v1/inventory.html
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
/*       Assert.assertEquals("user-name","standard_user");
        Assert.assertEquals("password","standard_user");

 */
        driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.TAB+"secret_sauce"+Keys.ENTER);

       // driver.findElement(By.id("login-button")).click();
        driver.findElement(By.className("radius")).click();
        String errorMa=  driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();
        Assert.assertTrue(errorMa.contains("user-name and password do not match "));
        String rgbColor = driver.findElement(By.cssSelector("button[class=\"error-button\"]")).getCssValue("color");
        String hexColor = Color.fromString(rgbColor).asHex();






    }
}
