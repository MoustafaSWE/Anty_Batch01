package session_03.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment_02 {

    /*
    Test Case No1 : Validate that user can log in successfully
        1. Open URL: https://www.saucedemo.com/v1/
        2. Enter Invalid username: standard
        3. Enter Invalid Password: secret
        4. Click On Login


        
     */

    public static void main(String[] args) {


        // 1. Open URL: https://www.saucedemo.com/v1/
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/");

        // 2. Enter Valid username: standard
        driver.findElement(By.id("user-name")).sendKeys("standard");
        // 3. Enter Valid Password: secret
        driver.findElement(By.id("password")).sendKeys("secret");


        // 4. Click On Login
        driver.findElement(By.id("login-button")).click();



    }
}
