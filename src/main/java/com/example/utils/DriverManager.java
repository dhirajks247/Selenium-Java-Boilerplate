package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.qameta.allure.Step;  // Allure Step annotation

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            initializeDriver();
        }
        return driver.get();
    }

    @Step("Initialize WebDriver")
    public static void initializeDriver() {
        String browser = ConfigReader.getProperty("browser").toLowerCase();
        WebDriver webDriver;

        switch (browser) {
            case "firefox":
                webDriver = new FirefoxDriver();
                break;
            case "chrome":
            default:
                webDriver = new ChromeDriver();
                break;
        }

        webDriver.manage().window().maximize();
        driver.set(webDriver);
    }

    @Step("Quit WebDriver")
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
