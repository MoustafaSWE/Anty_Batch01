package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class T01_Static_Dropdown {

//    Static dropdown list:	dropdowns having tagName "Select"

//    Dynamic dropdown list:	dropdowns having different tagName other than "Select"
//    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose


    public static void main(String[] args) throws Exception {

        // 3- Configuration
        WebDriver driver;

        driver = new ChromeDriver();
        //3.1- Maximize browser
        driver.manage().window().maximize();

        //3.2- Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 4- Navigate to website
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");


        // 1- Define WebElement for the list


        // 2- Create new object from Select class in selenium
        //you should make sure about this >> import org.openqa.selenium.support.ui.Select;
        Select selectFromDropDownMenu = new Select(driver.findElement(By.id("dropdown")));


        //3- Select options using 3 methods
        //3.1- SelectByIndex

selectFromDropDownMenu.selectByIndex(1);
        //3.2- SelectByValue
        //Note SelectByValue input value is String but SelectByIndex is Integer
selectFromDropDownMenu.selectByValue("2");

        //3.3- SelectByVisibleText
selectFromDropDownMenu.selectByVisibleText("Option 1");

        driver.quit();
    }

}



