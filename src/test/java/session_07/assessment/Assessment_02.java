package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

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
    String word = "mazda mx-5";
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
            WebElement searchButton =  driver.findElement(By.cssSelector("input[type=\"text\"]"));
            searchButton.sendKeys("mazda mx-5"+Keys.ENTER);
            List<WebElement> findWordInText = driver.findElements(By.cssSelector("ul div[class=\"s-item__wrapper clearfix\"]"));
            for (int g=0; g < findWordInText.size() ;g++){
                if (findWordInText.get(g).getText().contains("word"));
                System.out.println(findWordInText.get(g).getText());
            }
            WebElement manual = driver.findElement(By.xpath("//span[@class=\"checkbox__icon\"][1]"));
            boolean enabled = manual.isEnabled();


        }

        }




