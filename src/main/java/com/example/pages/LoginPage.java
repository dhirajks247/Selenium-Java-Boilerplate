package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.qameta.allure.Step;  // Allure Step annotation

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Enter username: {0}")  // Allure Step annotation for better reporting
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    @Step("Enter password")
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    @Step("Click login button")  
    public void clickLogin() {
        loginButton.click();
    }

    @Step("Login with username: {0} and password")  
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
