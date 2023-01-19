package com.herokuapp.theinternet.editortests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.EditorPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTests extends TestUtilities {

    @Test
    public void defaultEditorTestValue(){

        log.info("Starting defaultEditorTestValue");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        welcomePage.scrollToBottom();
        EditorPage editorPage = welcomePage.clickWYSIWYGEditorLink();
        String actualEditorText=editorPage.getEditorText();
        Assert.assertEquals(actualEditorText, "Your content goes here.");

    }
}
