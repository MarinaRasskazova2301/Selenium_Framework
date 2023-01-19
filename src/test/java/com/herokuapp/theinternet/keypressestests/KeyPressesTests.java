package com.herokuapp.theinternet.keypressestests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.KeyPressesPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesTests extends TestUtilities {

    @Test
    public void pressKeyTest() {

        log.info("Starting pressKeyTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        keyPressesPage.pressKey(Keys.ENTER);
        String result=keyPressesPage.getResultText();

        Assert.assertEquals(result, "You entered: ENTER");
    }

    @Test
    public void pressKeyWithActionsTest(){
        log.info("Starting pressKeyWithActionsTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        KeyPressesPage keyPressesPage = welcomePage.clickKeyPressesLink();
        keyPressesPage.pressKeyWithActions(Keys.SPACE);
        String result=keyPressesPage.getResultText();

        Assert.assertEquals(result, "You entered: SPACE");
    }

}
