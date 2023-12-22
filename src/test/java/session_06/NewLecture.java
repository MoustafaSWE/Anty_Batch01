package session_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.util.List;


public class NewLecture {
    public static void main(String[] args) {
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

         /*
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("standard_user");
        driver.findElement(By.id("login-button")).click();
        String actualResult = driver.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();
        Assert.assertTrue(actualResult.contains("Username and password do not match any user in this service"));
        String RGBColor = driver.findElement(By.className("error-button")).getCssValue("color");
        String hexColor = Color.fromString(RGBColor).asHex();
        Assert.assertEquals(RGBColor, "f0000");
        String correctURl = driver.getCurrentUrl();
        Assert.assertEquals(correctURl,"https://www.saucedemo.com/v1/inventory.html");

         */
        /*WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        List<WebElement> dynamic = driver.findElements(By.cssSelector("//table[@role=\"presentation\"][1]"));

         */


    }
}
