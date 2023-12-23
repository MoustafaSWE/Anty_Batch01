package session_07.testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TestCase 01:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Valid username: standard_user
    4. Enter Valid password: secret_sauce
    5. Click on Login
    6. Close Browser

TestCase 02:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Invalid username: secret_sauce
    4. Enter Invalid password: standard_user
    5. Click on Login
    6. Close Browser
 */
public class ClassJ {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod (){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }

    @Test(priority = 2)
    public void test1 (){
        WebElement login = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        login.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        loginButton.click();
    }

    @Test(priority = 1, dependsOnMethods = "test1")
    public void test2 (){
        WebElement login = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        login.sendKeys("standrd_user");
        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("secret_sce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        loginButton.click();

    }

    @AfterMethod
    public void afterMethod (){
        driver.quit();
    }

}
