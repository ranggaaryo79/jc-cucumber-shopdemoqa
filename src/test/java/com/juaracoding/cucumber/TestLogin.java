package com.juaracoding.cucumber;

import com.juaracoding.cucumber.pages.LoginPage;

import com.juaracoding.cucumber.utils.Constans;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestLogin {
    public LoginPage loginPage = new LoginPage();
    public static WebDriver driver;

    public TestLogin() {
        driver = Hooks.driver;
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        driver.get(Constans.URL);
        System.out.println("User open browser and url");
    }

    @When("User click my account")
    public void user_click_my_account() {
        loginPage.clickNotice();
        loginPage.clickMyAccount();
        System.out.println("User click my account");
    }

    @And("User enter valid username")
    public void user_enter_valid_username() {
        Hooks.delay();
        loginPage.enterUsername("ranggaaryo");
        System.out.println("User enter valid username");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        loginPage.enterPassword("rangga123");
        System.out.println("User enter valid password");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.buttonLoginClick();
        Hooks.delay();
        System.out.println("User click button login");
    }

    @Then("user go to page Dashboard")
    public void user_go_to_page_dashboard() {
        Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
        System.out.println("user go to page Dashboard");
        Hooks.delay();
    }

    @When("User click logout")
    public void user_click_logout() {
        loginPage.buttonLogoutClick();
        System.out.println("User click logout");
        Hooks.delay();

    }

    @And("User enter invalid username")
    public void user_enter_invalid_username() {
        loginPage.enterUsername("ranggaaryo");
        System.out.println("User enter invalid username");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password() {
        loginPage.enterPassword("test123");
        System.out.println("User enter invalid password");
    }

    @Then("user get message invalid credentials")
    public void user_get_message_invalid_credentials() {
        Assert.assertEquals(loginPage.getTxtAccountIncorrect(), "ERROR: The username or password you entered is incorrect. Lost your password?");
        Hooks.delay();
        System.out.println("user get message invalid credentials");

    }
}

