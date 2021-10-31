package com.custombananas.cb_cobra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowserTest extends BrowserTest {

    @BeforeAll
    public static void suiteSetup() {
        WebDriverManager.safaridriver().setup();
    }

    @BeforeEach
    public void testSetup() {
        driver = new SafariDriver();
        super.testSetup();
    }
}
