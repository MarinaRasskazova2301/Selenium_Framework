package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {

    private String pageUrl = "http://the-internet.herokuapp.com/";

    private By formAuthenticationLocator = By.linkText("Form Authentication");
    private By checkboxesLinkLocator = By.linkText("Checkboxes");
    private By dropdownLinkLocator = By.linkText("Dropdown");
    private By javaScriptAlertsLocator = By.linkText("JavaScript Alerts");
    private By multipleWindowsLocator = By.linkText("Multiple Windows");
    private By WYSIWYGEditorLocator = By.linkText("WYSIWYG Editor");
    private By keyPressesLocator = By.linkText("Key Presses");
    private By fileUploadLocator = By.linkText("File Upload");
    private By dragAndDropLocator = By.linkText("Drag and Drop");
    private By hooversLocator = By.linkText("Hovers");
    private By horizontalSliderLocator = By.linkText("Horizontal Slider");

    public WelcomePage(WebDriver driver, Logger log) {
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
        log.info("Clicking 'Checkboxes' link on Welcome Page");
        click(checkboxesLinkLocator);
        return new CheckboxesPage(driver, log);
    }

    public DropdownPage clickDropdownLink() {
        log.info("Clicking 'Dropdown' link on Welcome Page");
        click(dropdownLinkLocator);
        return new DropdownPage(driver, log);
    }
    public JavaScriptAlertsPage clickJavaScriptAlertLink() {
        log.info("Clicking 'JavaScriptAlerts' link on Welcome Page");
        click(javaScriptAlertsLocator);
        return new JavaScriptAlertsPage(driver, log);
    }

    public WindowsPage clickMultipleWindowsLink() {
        log.info("Clicking 'Multiple Windows' Link on Welcome Page");
        click(multipleWindowsLocator);
        return new WindowsPage(driver, log);
    }

    public EditorPage clickWYSIWYGEditorLink() {
        log.info("Clicking 'WYSIWYG Editor' Link on Welcome Page");
        click(WYSIWYGEditorLocator);
        return new EditorPage(driver, log);
    }
    public KeyPressesPage clickKeyPressesLink() {
        log.info("Clicking 'Key Presses' Link on Welcome Page");
        click(keyPressesLocator);
        return new KeyPressesPage(driver, log);
    }
    public FileUploadPage clickFileUploadLink() {
        log.info("Clicking 'File Upload' Link on Welcome Page");
        click(fileUploadLocator);
        return new FileUploadPage(driver, log);
    }
    public DragAndDropPage clickDragAndDropLink() {
        log.info("Clicking 'Drag and Drop' Link on Welcome Page");
        click(dragAndDropLocator);
        return new DragAndDropPage(driver, log);
    }

    public HoversPage clickHooversLink() {
        log.info("Clicking 'Hoovers' Link on Welcome Page");
        click(hooversLocator);
        return new HoversPage(driver, log);
    }
    public HorizontalSliderPage clickHorizontalSliderLink() {
        log.info("Clicking 'Horizontal Slider' Link on Welcome Page");
        click(horizontalSliderLocator);
        return new HorizontalSliderPage(driver, log);
    }


   }
