package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Login {
    WebDriver driver;

    // 1- Constructor
    public P01_Login (WebDriver driver){
        this.driver = driver;
    }

    // 2- Elements
    private final By userNameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By clickButtonLocator = By.id("login-button");

    // 3- Action
    public void userEnterValidUserName (String username){
        driver.findElement(userNameLocator).sendKeys(username);
    }
    public WebElement password (){
        return driver.findElement(passwordLocator);
    }



}
