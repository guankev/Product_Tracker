package com.dev.haskin.product_tracker;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UseChromeDriver implements WebDriver {
    public RemoteWebDriver initialize(){
        // TODO: rewrite to location of chrome driver
        System.setProperty("webdriver.chrome.driver","C:/Users/guank/Documents/Coding Project/drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        return driver;
    }
}
