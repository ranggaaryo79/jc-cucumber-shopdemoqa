package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.utils.Constans;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Constans.CHROME);
        driver = DriverSingleton.getDriver();


    }

    @AfterAll
    public static void quitBrowser() {
        delay();
        DriverSingleton.closeObjectInstance();
    }

    static void delay() {
        System.out.println("Delay 1 second");
        try {
            Thread.sleep(Constans.SECOND * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
