package session_07.testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassG {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test
    public void test1 (){
        System.out.println("Test 1");
    }

    @Test
    public void test2 (){
        System.out.println("Test 2");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("After Class");
    }
}
