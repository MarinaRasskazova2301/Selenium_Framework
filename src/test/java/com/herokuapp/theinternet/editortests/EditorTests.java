package com.herokuapp.theinternet.editortests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTests extends TestUtilities {

    @Test
    public void defaultEditorTestValue(){

        log.info("Starting defaultEditorTestValue");
        WelcomePageObject welcomePageObject = new WelcomePageObject(driver, log);
        welcomePageObject.openPage();
        EditorPage editorPage = welcomePageObject.clickWYSIWYGEditorLink();
        String actualEditorText=editorPage.getEditorText();
        Assert.assertEquals(actualEditorText, "Your content goes here.");

    }
}
