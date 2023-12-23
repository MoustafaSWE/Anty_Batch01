package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assessment_02 {

        /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter valid password: secret_sauce
        4. Click on Login button
    Expected Result:
        1. Assert that you are on this URL: https://www.saucedemo.com/v1/inventory.html
        2. Assert that all product contains "$" beside its price
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce"+ Keys.ENTER);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/v1/");
        Integer numberOfDollar =  driver.findElements(By.xpath("class=\"inventory_item_price\"")).size();
        }


    }


