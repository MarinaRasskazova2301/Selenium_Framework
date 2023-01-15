package com.herokuapp.theinternet.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;

import java.util.Locale;

public class BrowserDriverFactory {
    private ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    private String browser;
    private Logger log;

    public BrowserDriverFactory(String browser, Logger log) {
        this.browser = browser.toLowerCase();
        this.log=log;
    }

    public WebDriver createDriver() {

      log.info("Create driver: " + browser);

        switch (browser) {
            case "chrome":

                driver.set(new ChromeDriver());
                break;

            case "firefox":

                driver.set(new FirefoxDriver());
                break;

            default:
                System.out.println("Do not know how to start: " + browser + ", starting chrome.");
                //	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver());
                break;
        }
     return driver.get();
    }



}
