package com.herokuapp.theinternet.jserrorstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.JSErrorPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class JSErrorTests extends TestUtilities {

    @Test
    public void jsErrorTest() {

        log.info("Starting jsErrorTest");
        SoftAssert softAssert = new SoftAssert();

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        JSErrorPage jsErrorPage = welcomePage.clickJSErrorLink();

        List<LogEntry> logs = getBrowserLogs();

        // Verifying there are no JavaScript errors in console
//        for (LogEntry logEntry : logs) {
//            if (logEntry.getLevel().toString().equals("SEVERE")) {
//                softAssert.fail("Severe error: " + logEntry.getMessage());
//            }
//        }

        logs.stream().filter(log -> log.getLevel().toString().equals("SEVERE"))
                .forEach(e -> softAssert.fail("Severe error: " + e.getMessage()));

        softAssert.assertAll();

    }

}
