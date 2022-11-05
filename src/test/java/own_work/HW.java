package own_work;

import org.testng.annotations.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW {



    @Test
    public void apple() {
        System.out.println("apple is running");
    }


    @Test
    public void apple2() {
        System.out.println("apple2 is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("Before working");
    }

    @AfterClass
    public void tearDown(){

        System.out.println("Before working");
    }

}

