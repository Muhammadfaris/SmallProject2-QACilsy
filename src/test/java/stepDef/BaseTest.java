package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.DriverUtils.getDriver;
import static utils.DriverUtils.tearDown;

public class BaseTest {


    @Before
    public static void setUp(){
        System.out.println("initial");
        getDriver();
    }

    @After
    public static void  tearDownBrowser(){
        tearDown();
    }
}
