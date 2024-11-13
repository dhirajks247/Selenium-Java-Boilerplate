package com.example.tests;

import com.example.constants.Constants;
import com.example.pages.LoginPage;
import org.testng.annotations.Test;
import io.qameta.allure.Description;  // Allure Description annotation
import io.qameta.allure.Story;  // Allure Story annotation

public class LoginTest extends BaseTest {

    @Test
    @Description("Test for successful login")  // Allure Description annotation for reporting
    @Story("Successful Login")  // Allure Story annotation for reporting
    public void testSuccessfulLogin() {
        driver.get(Constants.BASE_URL);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(Constants.VALID_USERNAME, Constants.VALID_PASSWORD);

        // Add assertions here to verify successful login
    }

    @Test
    @Description("Test for invalid login attempt")
    @Story("Invalid Login")
    public void testInvalidLogin() {
        driver.get(Constants.BASE_URL);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid", "invalid");

        // Add assertions here to verify error message
    }
}
