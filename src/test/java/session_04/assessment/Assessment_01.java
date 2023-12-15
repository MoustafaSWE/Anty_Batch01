package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_01 {
    public static void main(String[] args) {
        //define webdriver
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.cazoo.co.uk/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"cui__sc-mqi3p7-0 fuyLT\"]"))).click();
//choose audi
        Select makeDropDownMenu = new Select(driver.findElement(By.name("make")));
        makeDropDownMenu.selectByValue("audi");
        //chose mode a1
        Select makeDropDownMenumodel = new Select(driver.findElement(By.name("model")));
        makeDropDownMenumodel.selectByValue("aA1");

        driver.findElement(By.cssSelector("button[data-test-id='buy-form-btn']")).click();

        for (int i = 0; i < driver.findElements(By.className("f")).size() ; i++){

            System.out.println(driver.findElements(By.className("vehicle-cardstyles__LinkWrap-sc-1bxv5iu-5")).get(i).getText());
        }

    }

    /*
        TestCase:
            1. Go to URL: https://www.cazoo.co.uk/
            2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "Audi A1 1.4 TFSI S line Sportback S Tronic"
     */



    }
