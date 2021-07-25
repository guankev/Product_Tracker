package com.dev.haskin.product_tracker;


import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Main starting function of the application
 */
public class App {
    public static void main(String[] args) {
        RemoteWebDriver chromeDriver = new UseChromeDriver().initialize();
        chromeDriver.close();
    }
}
