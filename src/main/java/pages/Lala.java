package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lala {
    WebDriver driver;
    //Element define in class
    By searchButtonLocator = By.cssSelector("button[type=\"submit\"]");
    //create public with name lala
    //add this.driver = driver
    public Lala(WebDriver driver) {
        this.driver = driver;

    }
    //Action --> name object with any name like searchClickLocator and copy locator
    public void searchClickLocator (){

        driver.findElement(By.id("login-button")).click();
    }
}
