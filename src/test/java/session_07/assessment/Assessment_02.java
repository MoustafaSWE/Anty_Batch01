package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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

    @BeforeMethod
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void MainPageValidate() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
    }

    @Test(priority = 2)
    public void SearchItem() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        searchBox.sendKeys("mazda mx-5");
        WebElement searchButton = driver.findElement(By.xpath("//td[@class=\"gh-td gh-sch-btn\"]"));
        searchButton.click();
        int size = driver.findElements(By.xpath("//div[@class=\"s-item__title\"]")).size();
        System.out.println(size);

        for (int i = 0; i < size ; i++) {
            String elements = driver.findElements(By.cssSelector("ul li[class=\"s-item s-item__pl-on-bottom\"]")).get(i).getText();
            Assert.assertTrue(elements.toLowerCase().contains("mazda mx-5"));
        }
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
