package com.dev.haskin.product_tracker;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Main starting function of the application
 */
public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/guank/Documents/Coding Project/drivers/chromedriver.exe");
        ChromeDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");

        // Test push
    }
}
