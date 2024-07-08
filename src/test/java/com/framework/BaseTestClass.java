package com.framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import static com.testframework.DriverFactory.getChromeDriver;

public class BaseTestClass {
    static WebDriver driver;
    public static final String MAIN_URL = "https://github.com/";

    @BeforeAll
    static void setUp() {
        driver = getChromeDriver();
    }

    @AfterAll
    static void cleanUp(){
        driver.close();
    }

}
