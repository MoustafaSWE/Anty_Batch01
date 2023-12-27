package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Login {
    WebDriver driver;



    //1- constructor

    public P01_Login(WebDriver driver) {
        this.driver = driver;
    }
    //2- Elements
   private final By userNameLocator = By.id("user-name");
   private final By passwordLocator = By.id("password");
    By loginLocator = By.id("login-button");
    By burgerButton = By.className("bm-burger-button");
    By logoutButton = By.id("logout_sidebar_link");

    //3- Actions
    public void  userNameLocator (String username){


        driver.findElement(userNameLocator).sendKeys(username);
    }
    public WebElement password  () {
        return driver.findElement(passwordLocator);
    }
    public  WebElement login (){
         return driver.findElement(loginLocator);
    }
    public  WebElement burgerButton () {
        return driver.findElement(burgerButton);

    }
    public  WebElement logoutButton (){
        return  driver.findElement(logoutButton);
    }





}
