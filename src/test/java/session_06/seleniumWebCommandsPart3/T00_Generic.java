package session_06.seleniumWebCommandsPart3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T00_Generic {

    public static void main(String[] args) {
     /*   WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("");

*/
        //hard assert
        //soft assert
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(3,3);
        softAssert.assertEquals(2,5);
        softAssert.assertTrue(true);
        softAssert. assertAll();
    }
}
