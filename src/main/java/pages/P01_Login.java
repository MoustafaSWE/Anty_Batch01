package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Login {
    WebDriver driver;

    public P01_Login (WebDriver driver){
        this.driver = driver;

    }
   // 2 - Element
    private final By userNameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By clickButtonLocator = By.id("login-button");

    //3- Action
    public void userEnterValidUserName (String username){
        driver.findElement(userNameLocator).sendKeys(username);
    }
    public void userEnterValidPassword (String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
     public void valiLoginButton (){
         driver.findElement(By.id("login-button")).click();
     }
     //public void inValidUserName ()

}
