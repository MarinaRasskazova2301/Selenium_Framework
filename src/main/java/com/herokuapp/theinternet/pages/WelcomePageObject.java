package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By javaScriptAlertsLocator = By.linkText("JavaScript Alerts");



    public WelcomePageObject(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }

    public LoginPage clickAuthenticationLink() {
        log.info("Clicking Authentication link on Welcome Page");
        click(formAuthenticationLocator);
        return new LoginPage(driver, log);
    }

    public CheckboxesPage clickCheckboxesLink() {
        log.info("Clicking Checkboxes link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver, log);
    }

    public DropdownPage clickDropdownLink() {
        log.info("Clicking Dropdown link on Welcome Page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }
    public JavaScriptAlertsPage clickJavaScriptAlertLink() {
        log.info("Clicking JavaScriptAlerts link on Welcome Page");
        click(javaScriptAlertsLocator);
        return new JavaScriptAlertsPage(driver, log);
    }

}
