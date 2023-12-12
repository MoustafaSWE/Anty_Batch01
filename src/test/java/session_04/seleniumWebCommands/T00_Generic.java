package session_04.seleniumWebCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T00_Generic {

    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/abtest']")).click();
       String text1= driver.findElement(By.cssSelector("div[class='example'] p")).getText();
        System.out.println(text1);

    }
}
