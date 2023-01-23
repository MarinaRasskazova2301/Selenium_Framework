package com.herokuapp.theinternet.loginpagetests;

import com.herokuapp.theinternet.base.CsvDataProviders;
import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class NegativeLogInTests extends TestUtilities {


    @Test(priority = 1, dataProvider="csvReader", dataProviderClass = CsvDataProviders.class)
    public void negativeLoginTest(Map<String, String> testData) {
       String no=testData.get("no");
       String username= testData.get("username");
       String password= testData.get("password");
       String expectedErrorMessage= testData.get("expectedMessage");
       String description= testData.get("description");

        log.info("Starting negativeLogInTest #" +no+" for "+description);

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        LoginPage loginPage = welcomePage.clickAuthenticationLink();
        loginPage.negativeLogIn(username, password);
        String message = loginPage.getErrorMessageText();

        Assert.assertTrue(message.contains(expectedErrorMessage),
                "actualErrorMessage does not contain expectedErrorMessage\nexpectedErrorMessage: "
                        + expectedErrorMessage + "\nactualErrorMessage: " + message);
    }


}
