package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_SEARCH {

    WebDriver driver;


    public P01_SEARCH(WebDriver driver) {
        this.driver = driver;}
    By searchname = By.cssSelector("button[class=\"button-1 search-box-button\"]");

public void cansearch(){
   driver.findElement(searchname).click();

}}