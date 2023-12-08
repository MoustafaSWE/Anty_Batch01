package session_04.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assessment_01 {

    /*
        TestCase:
            1. Go to URL: https://www.cazoo.co.uk/
            2. Wait and Click on Accept all Cookies  -- User Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "Audi A1 1.4 TFSI S line Sportback S Tronic"
     */

    public static void main(String[] args) {

        
    }
}

/*
        Model Answer:

        WebDriver driver;

                driver = new ChromeDriver();

                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                driver.navigate().to("https://www.cazoo.co.uk/");

                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[class=\"cui__sc-mqi3p7-0 fuyLT\"]")))).click();

                Select makeDropDownMenu = new Select(driver.findElement(By.name("make")));
                makeDropDownMenu.selectByValue("audi");

                Select modelDropDownMenu = new Select(driver.findElement(By.name("model")));
                modelDropDownMenu.selectByValue("a1");

                driver.findElement(By.cssSelector("button[data-test-id='buy-form-btn']")).click();

                for (int i = 1; i < driver.findElements(By.className("vehicle-cardstyles__LinkWrap-sc-1bxv5iu-5")).size() ; i++){

                    System.out.println(driver.findElements(By.className("vehicle-cardstyles__LinkWrap-sc-1bxv5iu-5")).get(i).getText());
                }

                driver.quit();
            }
         */
