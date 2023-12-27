package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_Search {
    WebDriver driver;

    public P02_Search(WebDriver driver) {
        this.driver = driver;
    }

    By searchButton= By.cssSelector("button[class=\"button-1 search-box-button\"]");


    public WebElement searchButton (){
       return driver.findElement(searchButton);

    }

}