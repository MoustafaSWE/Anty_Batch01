package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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


    }
}
