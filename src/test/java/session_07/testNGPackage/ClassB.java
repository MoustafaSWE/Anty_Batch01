package session_07.testNGPackage;

import org.testng.annotations.*;

public class ClassB {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Before Method");
    }

    @Test
    public void test (){
        System.out.println("Test");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("After Method");
    }


}
