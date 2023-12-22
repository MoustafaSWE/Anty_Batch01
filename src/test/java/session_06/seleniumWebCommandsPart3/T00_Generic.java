package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
       /* WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("");

        */
        // Hard Assert
       // Assert.assertEquals(5,5); // pass
       // Assert.assertEquals("Aya", "oya");// fail
      //  Assert.assertEquals(1.4, 1.4);// pass

        // soft assert
        SoftAssert softAssert = new  SoftAssert();
       softAssert.assertEquals("aya","aya");
       softAssert.assertEquals(2,5);
       softAssert.assertTrue(true);
       softAssert.assertEquals(5,1);
       softAssert.assertFalse(true);
       softAssert.assertAll(); // imp to action of assert
    }
}
