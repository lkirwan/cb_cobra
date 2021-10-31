package com.custombananas.cb_cobra;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class BrowserTest {

    WebDriver driver;
    WebDriverWait driverWait;

    @AfterEach
    public void testTeardown() {
        driver.close();
        driver.quit();
    }

    @BeforeEach
    public void testSetup() {
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    @Test
    public void navigateFromHomepageToLogin() {

        driver.get("https://wordpress.com/");
        assertThat(driver.getTitle()).contains("Managed WordPress Hosting");

        driver.findElement(By.xpath("//a[@title='Log In']")).click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameOrEmail")));

        assertThat(driver.getTitle()).contains("Log In");
    }
}
