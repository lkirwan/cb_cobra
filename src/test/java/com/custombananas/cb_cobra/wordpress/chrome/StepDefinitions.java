package com.custombananas.cb_cobra.wordpress.chrome;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    WebDriver driver;
    WebDriverWait driverWait;

    @BeforeAll
    public static void suiteSetup() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void testSetup() {
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    @After
    public void testTeardown() {
        driver.close();
        driver.quit();
    }

    @Given("I'm on the login screen")
    public void i_m_on_the_login_screen() {

        driver.get("https://wordpress.com/");
        assertThat(driver.getTitle()).contains("Managed WordPress Hosting");

        driver.findElement(By.xpath("//a[@title='Log In']")).click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernameOrEmail")));

        assertThat(driver.getTitle()).contains("Log In");
    }

    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be {string}")
    public void i_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
