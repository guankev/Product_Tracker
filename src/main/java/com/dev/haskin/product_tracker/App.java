package com.dev.haskin.product_tracker;


/**
 * Main starting function of the application
 */
public class App {
    public static void main(String[] args) {
        WebDriver chromeDriver = new UseChromeDriver();
        chromeDriver.initialize();
    }
}
