package com.herokuapp.theinternet.windowstests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.NewWindowPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import com.herokuapp.theinternet.pages.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowsTests extends TestUtilities {

@Test
    public void multipleWindows(){

    log.info("Starting jsDismissTest");
    WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
    welcomePageObject.openPage();
    WindowsPage windowsPage = welcomePageObject.clickMultipleWindowsLink();
    windowsPage.openNewWindow();
    NewWindowPage newWindowPage=windowsPage.switchToNewWindowPage();
    String pageSource=newWindowPage.getCurrentPageSourse();
    System.out.println(pageSource);
    Assert.assertTrue(pageSource.contains("New Window"), "New page source does not contain 'New Window' text");

}

}