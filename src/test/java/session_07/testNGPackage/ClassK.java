package session_07.testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

/*
TestCase 01:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Valid username: standard_user
    4. Enter Valid password: secret_sauce
    5. Click on Login
    6. Click on Menu
    7. Click on Logout

TestCase 02:
    1. Open Browser
    2. Open URL: https://www.saucedemo.com/v1/
    3. Enter Invalid username: secret_sauce
    4. Enter Invalid password: standard_user
    5. Click on Login
    6. Close Browser
 */
public class ClassK {
    WebDriver driver;

    @BeforeClass
    public void beforeClass (){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test1 (){
        WebElement login = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        login.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        loginButton.click();
        WebElement hamburgerMenu = driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]"));
        hamburgerMenu.click();
        WebElement logout = driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]"));
        logout.click();
    }

    @Test
    public void test2 (){
        WebElement login = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        login.sendKeys("standrd_user");
        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pass.sendKeys("secret_sce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        loginButton.click();
    }

    @AfterClass
    public void afterClass (){
        driver.quit();
    }
}

