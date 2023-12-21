package session_07.testNGPackage;

import org.testng.annotations.*;

/*
TestCase 01:
    1. Open Browser
    2. Open URL: swagLabs.com
    3. Enter Valid username
    4. Enter Valid password
    5. Click on Login
    6. Close Browser
 */
public class ClassE {

    @BeforeClass
    public void beforeClass (){
        System.out.println("1. Open Browser");
        System.out.println("2. Open URL: swagLabs.com");
    }

    @Test
    public void test (){
        System.out.println("3. Enter Valid username");
        System.out.println("4. Enter Valid password");
        System.out.println("5. Click on Login");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("6. Close Browser");
    }
}
