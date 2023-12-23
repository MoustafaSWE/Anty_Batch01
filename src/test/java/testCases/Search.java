package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
        //Element
        By searchButtonLocator = By.cssSelector("button[type=\"submit\"]");
    }
        //Action
        public void searchClickLocator (){
            driver.findElement(By.id("login-button")).click();
        }
    }

