package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_01 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Valid username: standard_user
        3. Enter Valid Password: secret_sauce
        4. Click On Login
     */

    public static void main(String[] args) {

WebDriver driver;
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.saucedemo.com/v1/");
driver.findElement(By.id("user-name")).sendKeys("standard_user"+ Keys.TAB+"secret_sauce"+Keys.ENTER);






        // 1. Open URL: https://www.saucedemo.com/v1/

        // 2. Enter Valid username: standard_user

        // 3. Enter Valid Password: secret_sauce

        // 4. Click On Login


    }
}
