package session_04.seleniumWebCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class T02_Dynamic_Dropdown {

//    Static dropdown list:	dropdowns having tagName "Select"
//    Dynamic dropdown list:	dropdowns having different tagName other than "Select"
//    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose

    public static void main(String[] args) {
        WebDriver driver;

        // 2- Create new object from chromedriver
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 3- Configuration
        //3.1- Maximize browser
        driver.manage().window().maximize();

        //3.2- Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 4- Navigate to website
        driver.navigate().to("https://www.google.com/");


        //1- search on "selenium"

        // 2- dynamic dropdown list
        // We couldn't use Select class with dynamic lists, instead we could handle it with findElements() method


        driver.quit();

    }
}



