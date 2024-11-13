package com.example.tests;

import com.example.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Feature;  // Allure Feature annotation

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    @Feature("WebDriver Setup")  // Allure Feature annotation for reporting
    public void setUp() {
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    @Feature("WebDriver Teardown")
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
