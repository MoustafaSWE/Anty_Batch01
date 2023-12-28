package session_07.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/*
    Scenario 1 (Verify that user cannot log in with valid but not registered email)
        ● Go to https://www.amazon.eg/
        ● Verify user can’t login with valid but not registered email
    Scenario 2 ( Verify that Items are added to cart correctly
        ● Go to https://www.amazon.eg/
        ● Click on All tab
        ● Go to Today’s Deals
        ● Click on 2nd category
        ● Click on 1st product in this category
        ● Click on 2nd item in this product
        ● Add it to cart with Qty = 2
        ● Do all the necessary actions to add the item to the cart
        ● Go to cart
        ● Verify correct items are added to the cart (name, price, qty and subtotal is correct)
    Scenario 3: (Verify that you cannot see “Your Orders” and “Your Addresses” pages if you are not
    logged in. But you can see “Your Lists” intro screen)
        ● Go to https://www.amazon.eg/
        ● Click on “Hello, sign in Account & Lists” at the top right corner
        ● Select “Your orders”
        ● Make sure user can’t see orders when not signed in
        ● Select “Your Addresses”
        ● Make sure user can’t see orders when not signed in
        ● Select “Your Lists”
        ● Make sure user can see the screen
 */
public class Assessment_01 {
    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.amazon.eg/");
    }

    @Test
    public void test1 (){

    }

}
