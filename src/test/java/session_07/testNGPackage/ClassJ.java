package session_07.testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

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
       // System.out.println("1. Open Browser");
       // System.out.println("2. Open URL: swagLabs.com");
        driver= new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void test1 (){
       // System.out.println("3. Enter Valid username");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //System.out.println("4. Enter Valid password");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
       // System.out.println("5. Click on Login");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(priority = 1,dependsOnMethods = "test1")
    public void test2 (){
       // System.out.println("3. Enter Invalid username");
        driver.findElement(By.id("user-name")).sendKeys("user");
       // System.out.println("4. Enter Invalid password");
        driver.findElement(By.id("password")).sendKeys("sauce");
        //System.out.println("5. Click on Login");
        driver.findElement(By.id("login-button")).click();
    }

    @AfterMethod
    public void afterMethod (){
       // System.out.println("6. Close Browser");
        driver.quit();
    }

}
