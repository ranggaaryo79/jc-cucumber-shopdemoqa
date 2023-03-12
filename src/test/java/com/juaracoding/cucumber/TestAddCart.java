package com.juaracoding.cucumber;


import com.juaracoding.cucumber.pages.AddCartPage;
import com.juaracoding.cucumber.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddCart {

    public LoginPage loginPage = new LoginPage();
    public AddCartPage addCart = new AddCartPage();

    public static WebDriver driver;

    public TestAddCart(){
        driver = Hooks.driver;
    }

    @When("User click menu homepage")
    public void user_click_menu_homepage() {
        loginPage.login("ranggaaryo","rangga123");
        addCart.clickHomepage();
        System.out.println("User click menu homepage");
        Hooks.delay();
    }
    @And("User click product")
    public void user_click_product() {
        addCart.clickProduct();
        System.out.println("User click product");
        Hooks.delay();
    }
    @And("User select color product")
    public void user_select_color_product() {
        addCart.selectColor();
        System.out.println("User select color product");
    }
    @And("User select size product")
    public void user_select_size_product() {
        addCart.selectSize();
        System.out.println("User select size product");
    }
    @And("User select quantity product")
    public void user_select_quantity_product() {
        addCart.setAddIncreaseQty();
        System.out.println("User select quantity product");
    }

    @And("User click add to cart")
    public void user_click_add_to_cart() {
        Hooks.delay();
        addCart.btnAddtocart();
        System.out.println("User click add to cart");
    }
    @Then("Notify success add cart")
    public void notify_success_add_cart() {
        Assert.assertTrue(addCart.getNotifySuccessAddCart().contains("2 × “playboy x missguided plus size grey lips print front cropped t shirt” have been added to your cart."));
        System.out.println("Notify success add cart");
    }



}
