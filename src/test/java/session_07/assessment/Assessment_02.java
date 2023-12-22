package session_07.assessment;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

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
    String url = "https://www.ebay.com/";
    String searchText = "mazda mx-5";
    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(url);
    }
    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

    @Test
    public void testCase01(){
        /*
        ● From the left hand side filter using "Transmission" -> "Manual"
         */
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
        WebElement searchField = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
        searchField.sendKeys(searchText + Keys.ENTER);
        List<WebElement> listOfSearchResult = driver.findElements(By
                .cssSelector("ul li[class=\"s-item s-item__pl-on-bottom\"] div[class=\"s-item__title\"]"));


        for (int i = 0 ; i < listOfSearchResult.size() ; i++){
            if (listOfSearchResult.get(i).getText().toLowerCase().contains(searchText)){
                System.out.println(listOfSearchResult.get(i).getText());
                Assert.assertTrue(listOfSearchResult.get(i).getText().toLowerCase().contains(searchText));
            }
        }

        WebElement manualCheckBox = driver.findElement(By.cssSelector("input[aria-label=\"Manual\"]"));

        manualCheckBox.click();

        Assert.assertTrue(manualCheckBox.isEnabled());
    }
}
