package session_06.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assessment_02 {

        /*
    Test Case:
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Invalid password: secret_sauce
        4. Click on Login button
    Expected Result:
        1. Assert that you are on this URL: https://www.saucedemo.com/v1/inventory.html
        2. Assert that all product contains "$" beside its price
     */

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // 3. Enter Valid Password: secret
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // 4. Click On Login
        driver.findElement(By.id("login-button")).click();
       // 1. Assert that you are on this URL: https://www.saucedemo.com/v1/inventory.html
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html"));



        String expecteddoller ="$";
        int numberOfElements = driver.findElements(By
                .className("inventory_item")).size();
        for (int i = 0 ;i <numberOfElements ; i++){
            String iconName = driver.findElements(By
                    .className("inventory_item")).get(i).getText();
            System.out.println(iconName);
        }

        for (int i = 0 ;i <numberOfElements ; i++){
            if (driver.findElements(By.className("inventory_item"))
                    .get(i).getText().contains(expecteddoller))
                Assert.assertEquals(expecteddoller,"$");
            System.out.println(numberOfElements);

         System.out.println(expecteddoller);
            {
                driver.findElements(By.className("inventory_list"))
                        .get(i).click();
                break;
            }

        }

        driver.quit();
    }

}
