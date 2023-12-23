package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    @BeforeMethod
    public void beforeMethod() {
        // System.out.println("1. Open Browser");
        // System.out.println("2. Open URL: swagLabs.com");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.ebay.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        String home = driver.findElement(By.className("hl-cat-nav__active")).getText();
        Assert.assertTrue(home.contains("Home"));
    }

    @Test
    public void test01() {
        driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("mazda mx-5");
        driver.findElement(By.className("btn btn-prim gh-spr")).click();
        String nameItem;
        int size = driver.findElements(By.cssSelector("div[class=\"s-item__title\"]")).size();
        for (int i = 0; i < size; i++)
            if
            (driver.findElements(By.cssSelector("div[class=\"s-item__title\"]")).get(i).getText().toLowerCase().contains("mazda mx-5"))
            {
                System.out.println(size);
                Assert.assertTrue((driver.findElements(By.cssSelector("div[class=\"s-item__title\"]")).get(i).getText()
                        .toLowerCase().contains("mazda mx-5")));
            }

    }
}