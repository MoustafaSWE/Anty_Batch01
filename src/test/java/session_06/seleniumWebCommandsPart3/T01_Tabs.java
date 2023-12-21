package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.navigate().to("https://demo.nopcommerce.com/");
        // Element locator
        By twitterIconLocator = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        // Web Element
        WebElement twitterIcon = driver.findElement(twitterIconLocator);
        // 5- Click on Twitter Icon
        twitterIcon.click();
        // Store Tabs Array List
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        // Print Tabs numbers
        System.out.println(tabs.size());
        // switch to tab number 1
        driver.switchTo().window(tabs.get(0));
        // print tab number 1
        System.out.println(driver.getCurrentUrl());
        // switch to tab number 2
        driver.switchTo().window(tabs.get(1));
        // print tab number 2
        System.out.println(driver.getCurrentUrl());
    }
}
