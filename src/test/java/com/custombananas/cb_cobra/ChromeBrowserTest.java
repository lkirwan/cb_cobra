package com.custombananas.cb_cobra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest extends BrowserTest {

    @BeforeAll
    public static void suiteSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void testSetup() {
        driver = new ChromeDriver();
        super.testSetup();
    }
}
