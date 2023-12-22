package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://the-internet.herokuapp.com/abtest");
        //hard assert
     //  Assert.assertEquals(5,5);
      // Assert.assertEquals("Moustafa","Ismail");
     //  Assert.assertEquals(1.5,1.5);
// soft assert
        // SoftAssert softAssert = new SoftAssert();
        // softAssert.assertEquals(3,3);
        // softAssert.assertEquals(2,5);
       //  softAssert.assertTrue(true);
        // softAssert.assertEquals(2,10000);
        // softAssert.assertFalse(true);
        // softAssert.assertAll();
       String expectedValue = driver.findElement(By.cssSelector("div[class=\"example\"] h3")).getText();
       Assert.assertEquals("A/B Test Variation 1",expectedValue);
       driver.quit();
    }
}
