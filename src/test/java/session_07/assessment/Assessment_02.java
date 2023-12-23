package session_07.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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



}


   /* @BeforeClass


public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.cazoo.co.uk/");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[class=\"cui__sc-mqi3p7-0 fuyLT\"]")))).click();
        Select makeDropDownMenu = new Select(driver.findElement(By.name("make")));
        makeDropDownMenu.selectByValue("audi");

        Select modelDropDownMenu = new Select(driver.findElement(By.name("model")));
        modelDropDownMenu.selectByValue("a1");

        driver.findElement(By.cssSelector("button[data-test-id='buy-form-btn']")).click();
        for (int i = 1; i < driver.findElements(By.className("vehicle-cardstyles__LinkWrap-sc-1bxv5iu-5")).size() ; i++){

        System.out.println(driver.findElements(By.className("vehicle-cardstyles__LinkWrap-sc-1bxv5iu-5")).get(i).getText());
        }

        driver.quit();
        }
 /* @BeforeClass

    public void beforeClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.ebay.com/");
    }
 @Test
    public void test1() {
        String home = driver.findElement(By.cssSelector("[class=\"hl-cat-nav__active\"]")).getText();
        Assert.assertTrue(home.equals("Home"));
        System.out.println("you have landed on the main page");

    }

    @Test
    public void test2() {
        driver.findElement(By.cssSelector("[class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("mazda mx-5");
        driver.findElement(By.cssSelector("[class=\"btn btn-prim gh-spr\"]")).click();
    }
}

 */