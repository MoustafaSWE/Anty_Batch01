package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.ebay.com/");
    }

    @Test
    public void test1() {
        String home = driver.findElement(By.className("hl-cat-nav__active")).getText();
        Assert.assertTrue(home.equals("Home"));
        System.out.println("you have landed on the main page");
    }

    @Test
    public void test2() {
        WebElement search = driver.findElement(By.cssSelector("input[type=\"text\"]"));
        search.sendKeys("mazda mx-5");
        driver.findElement(By.cssSelector("td[class=\"gh-td gh-sch-btn\"]")).click();
        int numberOfResults = driver.findElements(By.cssSelector("div[id=\"srp-river-results\"] ul div[class=\"s-item__title\"]")).size();
        System.out.println(numberOfResults);
        for (int i = 0; i < numberOfResults; i++) {

            String title = driver.findElements(By.cssSelector("div[id=\"srp-river-results\"] ul div[class=\"s-item__title\"]")).get(i).getText().toLowerCase();
            Assert.assertTrue(title.contains("mazda mx-5"));
            System.out.println(title);
        }
    }

        @AfterClass
        public void afterClass () {
            driver.quit();
        }
    }
