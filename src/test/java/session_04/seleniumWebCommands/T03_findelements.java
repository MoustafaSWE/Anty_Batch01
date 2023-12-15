package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T03_findelements {

//    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user" + Keys.TAB + "secret_sauce" + Keys.ENTER);
        int numberOfAddToCart = driver.findElements(By.cssSelector(("button[class=\"btn_primary btn_inventory\"]"))).size();
        driver.findElements(By.cssSelector("button[class=\"btn_primary btn_inventory\"]")).get(3).click();
        String productName = driver.findElements(By.className("inventory_item_name")).get(2).getText();
        System.out.println("Number of add to cart:");
        System.out.println(numberOfAddToCart);
        System.out.println(productName);

    }


}
