package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
    Scenario 1 (Verify that user can search for mazda mx-5)
        ● Navigate to https://www.ebay.com/
        ● Validate that you have landed on the main page.
        ● Search for "mazda mx-5".
        ● Validate the results obtained.
        ● Print/log the number of obtained search results.
        ● From the left hand side filter using "Transmission" -> "Manual"
 */
public class Assessment_02 {
    WebDriver driver;
    String expectedCarName = "mazda mx-5";

        @BeforeMethod
        public void beforeMethod() {
            driver= new ChromeDriver();
            driver.navigate().to("https://www.ebay.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        }

        @Test
        public void test1(){
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/");
            WebElement searchButton = driver.findElement(By.cssSelector("input[type=\"text\"]"));
            searchButton.sendKeys("mazda mx-5");
            driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
            int findName = driver.findElements(By.xpath("div[class=\"s-item__info clearfix\"]")).size();
            for(int y=0; y < findName ; y++){
                if (driver.findElements(By.xpath("div[class=\"s-item__info clearfix\"]")).get(y).getText().contains("expectedCarName");
                break;
            }




            }

        }


