package session_07.testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
TestCase 01:
    1. Open Browser
    2. Open URL: swagLabs.com
    3. Enter Valid username
    4. Enter Valid password
    5. Click on Login
    6. Close Browser

TestCase 02:
    1. Open Browser
    2. Open URL: swagLabs.com
    3. Enter Invalid username
    4. Enter Invalid password
    5. Click on Login
    6. Close Browser
 */
public class ClassI {

    @BeforeClass
    public void beforeClass (){
        System.out.println("1. Open Browser");
        System.out.println("2. Open URL: swagLabs.com");
    }

    @Test
    public void test1 (){
        System.out.println("3. Enter Valid username");
        System.out.println("4. Enter Valid password");
        System.out.println("5. Click on Login");
    }

    @Test
    public void test2 (){
        System.out.println("3. Enter Invalid username");
        System.out.println("4. Enter Invalid password");
        System.out.println("5. Click on Login");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("6. Close Browser");
    }
}
