package session_07.testNGPackage;

import org.testng.annotations.*;

public class ClassB {

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("Before Method");
    }

    @Test
    public void test (){
        System.out.println("TC1");
    }

    @Test
    public void test1 (){
        System.out.println("TC2");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("After Method");
    }


}
