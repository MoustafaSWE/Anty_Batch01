package session_07.testNGPackage;

import org.testng.annotations.*;

public class ClassC {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test
    public void test (){
        System.out.println("Test");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("After Class");
    }

}
