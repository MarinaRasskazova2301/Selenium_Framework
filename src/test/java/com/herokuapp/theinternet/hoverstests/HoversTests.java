package com.herokuapp.theinternet.hoverstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HoversPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTests extends TestUtilities {

    @Test
    public void user2ProfileTest(){

        log.info("Starting user2ProfileTest");

        WelcomePage welcomePage=new WelcomePage(driver, log);
        welcomePage.openPage();
        HoversPage hoversPage=welcomePage.clickHooversLink();
        hoversPage.openUserProfile(2);
        Assert.assertTrue(hoversPage.getCurrentUrl().contains("/users/2"));
    }



}
