package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

    @Test
    public void ValidateThatPopupAppearsWhenUserClickOnSearchButtonWithoutInput (){
        driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();

        // Write your code here using Page Object Model

    }

}
