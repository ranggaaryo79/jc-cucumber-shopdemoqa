package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;


    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "woocommerce-store-notice__dismiss-link")
    WebElement notice;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement clickedMyAccount;

    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement btnLogout;


    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement txtDashboard;

    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement txtAccountIncorrect;


    public void enterUsername(String username) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void buttonLoginClick() {
        btnLogin.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void buttonLogoutClick() {
        btnLogout.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public void clickNotice() {
        notice.click();
    }

    public void clickMyAccount() {
        clickedMyAccount.click();
    }

    public String getTxtAccountIncorrect() {
        return txtAccountIncorrect.getText();
    }

    public String getTxtDashboard() {
        return txtDashboard.getText();
    }

    public void login(String username, String password) {
        clickedMyAccount.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
        js.executeScript("window.scrollBy(0,500)");


    }


}


