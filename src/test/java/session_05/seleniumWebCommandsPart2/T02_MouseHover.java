package session_05.seleniumWebCommandsPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class T02_MouseHover {

//    Don't apply Thread.sleep -> it is for you to see the execution ; remove it once you learn the script's purpose

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);

       WebElement imgNumber01 = driver.findElement(By.xpath("(//div[@class=\"figure\"])[1]"));

       // actions.moveToElement(driver.findElement(By.xpath("(//div[@class=\"figure\"])[1]"))).perform();

       actions.moveToElement(imgNumber01).perform();
    }
}
