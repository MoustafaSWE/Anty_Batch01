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
            2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
            3. Choose make Audi
            4. Choose model A1
            5. Print all result fount
            6. Click on product Card contains "Audi A1 1.4 TFSI S line Sportback S Tronic"
     */

    public static void main(String[] args) throws Exception {
        // define WebDriver
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  1. Go to URL: https://www.cazoo.co.uk/
        driver.navigate().to("https://www.cazoo.co.uk/");

        //  2. Wait and Click on Accept all Cookies  -- Use Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"cui__sc-mqi3p7-0 fuyLT\"]"))).click();

        //  3. Choose make Audi
        Select selectFromDropDownMenuMake = new Select(driver.findElement(By.name("make")));
        selectFromDropDownMenuMake.selectByValue("audi");

        // 4. Choose model A1
        Select selectFromDropDownMenuModel = new Select(driver.findElement(By.name("model")));
        selectFromDropDownMenuModel.selectByValue("a1");

        // Click on Search Button
        driver.findElement(By
                .xpath("(//button[@data-test-id=\"buy-form-btn\"])[1]"))
                .click();

        // 5. Print all result fount
        String expectedCarName = "Audi A1 1.4 TFSI S line Sportback S Tronic";
        int numberOfElements = driver.findElements(By
                .className("vehicle-cardstyles__MakeModelTrimWrapper-sc-1bxv5iu-12")).size();
        for (int i = 0 ;i <numberOfElements ; i++){
            String carName = driver.findElements(By
                    .className("vehicle-cardstyles__MakeModelTrimWrapper-sc-1bxv5iu-12")).get(i).getText();
            System.out.println(carName);
        }

      for (int i = 0 ;i <numberOfElements ; i++){
            if (driver.findElements(By.className("vehicle-cardstyles__MakeModelTrimWrapper-sc-1bxv5iu-12"))
                    .get(i).getText().contains(expectedCarName))
            {
                driver.findElements(By.className("vehicle-cardstyles__MakeModelTrimWrapper-sc-1bxv5iu-12"))
                        .get(i).click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.quit();
    }
}