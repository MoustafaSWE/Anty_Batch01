package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

public class T01_Tabs {

    public static void main(String[] args) {
        //1- Create an object from WebDriver
        WebDriver driver;

        // 2- Create new object from chromedriver
        driver = new ChromeDriver();


        // 3- Configuration
        //3.1- Maximize browser
        driver.manage().window().maximize();

        //3.2- Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 4- Navigate to website
        driver.get("https://demo.nopcommerce.com/");

        By twitterIconLocator = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        WebElement twitterIcon = driver.findElement(twitterIconLocator);
twitterIcon.click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
