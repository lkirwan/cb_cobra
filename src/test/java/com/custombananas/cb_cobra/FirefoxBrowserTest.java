package com.custombananas.cb_cobra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest extends BrowserTest {

    @BeforeAll
    public static void suiteSetup() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    public void testSetup() {
        driver = new FirefoxDriver();
        super.testSetup();
    }
}
