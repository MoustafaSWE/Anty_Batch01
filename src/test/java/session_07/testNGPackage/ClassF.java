package session_07.testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassF {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Before Method");
    }

    @Test
    public void test1 (){
        System.out.println("Test 1");
    }

    @Test
    public void test2 (){
        System.out.println("Test 2");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("After Method");
    }

}
