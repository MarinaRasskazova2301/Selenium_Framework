package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLocator = By.linkText("Form Authentication");

    public WelcomePageObject(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        driver.get(pageUrl);
        log.info("Page opened!");
    }

    public LoginPage clickAuthenticationLink() {
        log.info("Clicking Authentication link on Welcome Page");
        driver.findElement(formAuthenticationLocator).click();
        return new LoginPage(driver, log);
    }


}
