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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
        login=new P01_Login(driver);
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

    @Test (priority = 1)
    public void validateThatUserCanLoginWithValidData (){
        login.entervalidusername("standard");
      login.password().sendKeys("secret_sauce");
      login.loginbuttonn();

        Assert.assertFalse(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/"));
    }

    @Test (priority = 1)
    public void validateThatUserCantLoginWithInvalidData (){
        login.entervalidusername("standard");
        login.password().sendKeys("secret_sauce1");
        login.loginbuttonn();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/"));
    }

    @Test (dependsOnMethods = "validateThatUserCanLoginWithValidData")
    public void validateThatUserCanLoginFromHisAcc (){

        login.entervalidusername("standard");
        login.password().sendKeys("secret_sauce");
        login.loginbuttonn();
        login.burgerbuttom();
        login.logoutfromscreen();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/index.html"));
    }
}
