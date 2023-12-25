package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Login {
    WebDriver driver;

    public P01_Login(WebDriver driver) {
        this.driver = driver;

    }

    //elements
    By usernamelocator = By.id("user-name");
    By passwordlocator = By.id("password");
    By loginbutton = By.id("login-button");
    By burgermanu = By.className("bm-burger-button");
    By logoutscreen = By.className("bm-burger-button");


    //Actons
    public void entervalidusername(String username) {
        driver.findElement(usernamelocator).sendKeys("standard");
    }

    public WebElement password() {
        return driver.findElement(passwordlocator);
    }

    public void loginbuttonn() {
        driver.findElement(loginbutton).click();
    }

    public void burgerbuttom() {
        driver.findElement(burgermanu).click();
    }

    public void logoutfromscreen() {
        driver.findElement(logoutscreen).click();
    }
}