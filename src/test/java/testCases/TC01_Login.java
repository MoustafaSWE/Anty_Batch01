package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.P01_Login;

import java.time.Duration;

public class TC01_Login {
    WebDriver driver;
    P01_Login login;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        login = new P01_Login(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

    @Test (priority = 1)
    public void validateThatUserCanLoginWithValidData (){
        //driver.findElement(By.id("user-name")).sendKeys("standard_user");
        login.userNameLocator("standard_user");
        //driver.findElement(By.id("password")).sendKeys("secret_sauce");
       login.password().sendKeys("secret_sauce");
        //driver.findElement(By.id("login-button")).click();
        login.login().click();

        Assert.assertFalse(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/"));
    }

    @Test (priority = 1)
    public void validateThatUserCantLoginWithInvalidData (){
        //driver.findElement(By.id("user-name")).sendKeys("standard");
        login.userNameLocator("standard_user");
       // driver.findElement(By.id("password")).sendKeys("secret");
        login.password().sendKeys("seret_sauce");
        //driver.findElement(By.id("login-button")).click();
        login.login().click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/"));
    }

    @Test (dependsOnMethods = "validateThatUserCanLoginWithValidData")
    public void validateThatUserCanLoginFromHisAcc (){
      //  driver.findElement(By.id("user-name")).sendKeys("standard_user");
        login.userNameLocator("standard_user");

       // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        login.password().sendKeys("secret_sauce");

       // driver.findElement(By.id("login-button")).click();
        login.login().click();

       // driver.findElement(By.className("bm-burger-button")).click();
       login.burgerButton().click();
        //driver.findElement(By.id("logout_sidebar_link")).click();
        login.logoutButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/index.html"));
    }
}
