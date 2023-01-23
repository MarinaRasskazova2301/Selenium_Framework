package com.herokuapp.theinternet.alertstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JavaScriptAlertsPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertsTests extends TestUtilities {

    @Test
    public void jsAlertTest() {

        log.info("Starting jsAlertTest");

        SoftAssert softAssert=new SoftAssert();

        WelcomePage welcomePageObject = new WelcomePage(driver, log);
        welcomePageObject.openPage();
        JavaScriptAlertsPage alertsPage = welcomePageObject.clickJavaScriptAlertLink();
        alertsPage.openJSAlert();
        String alertMessage = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        String result = alertsPage.getResultText();
        softAssert.assertEquals(alertMessage, "I am a JS Alert", "Alert message text is wrong");
        softAssert.assertEquals(result, "You successfully clicked an alert", "Result message is wrong");

        softAssert.assertAll();
    }

    @Test
    public void jsDismissTest() {
        log.info("Starting jsDismissTest");

        SoftAssert softAssert=new SoftAssert();

        WelcomePage welcomePageObject = new WelcomePage(driver, log);
        welcomePageObject.openPage();
        JavaScriptAlertsPage alertsPage = welcomePageObject.clickJavaScriptAlertLink();
        alertsPage.openJSConfirm();
        String alertMessage = alertsPage.getAlertText();
        alertsPage.dismissAlert();
        String result = alertsPage.getResultText();
        softAssert.assertEquals(alertMessage, "I am a JS Confirm", "Alert message text is wrong");
        softAssert.assertEquals(result, "You clicked: Cancel", "Result message is wrong");

        softAssert.assertAll();
    }

    @Test
    public void jsPromptTest() {
        log.info("Starting jsPromptTest");

        SoftAssert softAssert=new SoftAssert();

        WelcomePage welcomePageObject = new WelcomePage(driver, log);
        welcomePageObject.openPage();
        JavaScriptAlertsPage alertsPage = welcomePageObject.clickJavaScriptAlertLink();
        alertsPage.openJSPrompt();
        String alertMessage = alertsPage.getAlertText();
        String textIntoAlert="Hello world";
        alertsPage.typeTextIntoAlert(textIntoAlert);
        String result = alertsPage.getResultText();
        softAssert.assertEquals(alertMessage, "I am a JS prompt", "Alert message text is wrong");
        softAssert.assertEquals(result, "You entered: "+textIntoAlert, "Result message is wrong");

        softAssert.assertAll();
    }
}
