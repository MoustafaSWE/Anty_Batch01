package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.kerberos.KeyTab;

public class T03_findelements {

//    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose

    public static void main(String[] args) {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        int numberOfAddToCart = driver.findElements(By.cssSelector("button[class='btn_primary btn_inventory']")).size();
        System.out.println("number Of Add To Cart buttons: " + numberOfAddToCart);
        driver.findElements(By.cssSelector("button[class='btn_primary btn_inventory']")).get(3).click();
       String titleis = driver.findElements(By.className("inventory_item_name")).get(2).getText();

        System.out.println(titleis);


    }


}
