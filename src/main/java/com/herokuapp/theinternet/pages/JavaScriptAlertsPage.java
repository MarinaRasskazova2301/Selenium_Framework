package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePageObject {

    By jsAlertButtonLocator = By.xpath("//button[@onclick='jsAlert()']");
    By jsConfirmLocator = By.xpath("//button[@onclick='jsConfirm()']");
    By jsPromptButtonLocator = By.xpath("//button[@onclick='jsPrompt()']");
    By resultTextLocator=By.id("result");

    public JavaScriptAlertsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openJSAlert() {
        log.info("Clicking on 'Click for JS alert button to open alert");
        find(jsAlertButtonLocator).click();
    }

    public void openJSConfirm() {
        log.info("Clicking on 'Click for JS confirm button to open alert");
        find(jsConfirmLocator).click();
    }

    public void openJSPrompt() {
        log.info("Clicking on 'Click for JS prompt button to open alert");
        find(jsPromptButtonLocator).click();
    }

    public String getAlertText(){
        Alert alert=switchToAlert();
        String alertText=alert.getText();
        log.info("Alert text is: "+alertText);
        return alertText;
    }


    public void acceptAlert() {
        log.info("Switching to alert and pressing Ok");
        Alert alert = switchToAlert();
        alert.accept();
    }

    public void dismissAlert() {
        log.info("Switching to alert and pressing Cancel");
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public void typeTextIntoAlert(String text) {
        log.info("Typing text into alert and pressing Ok");
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    public String getResultText(){
        String result=find(resultTextLocator).getText();
        log.info("Result text "+result);
        return result;
    }
}
