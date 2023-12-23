package testCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Lala;

import java.time.Duration;

/*
        Validate that popup appears, when user Click on search button without entering valid input in search
        Steps:
            1. Open URL: https://demo.nopcommerce.com/
            2. Click on Search button
            3. Assert that JS alert displayed
            4. Click on "OK" on JS alert
 */
public class TC02_Search {
    //Add webDriver driver
    WebDriver driver;
    //In class name class of other class and give it any name as object
    Lala truepage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");
        //Add object name = new (driver)
        truepage=new Lala(driver);
    }

    @AfterMethod

    @Test
    public void ValidateThatPopupAppearsWhenUserClickOnSearchButtonWithoutInput() {
        //Add name added in page which is truepage with الاختصار في الصفحه التانيه
        truepage.searchClickLocator();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertTrue(isAlertPresent);
        driver.switchTo().alert().accept();
    }
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


