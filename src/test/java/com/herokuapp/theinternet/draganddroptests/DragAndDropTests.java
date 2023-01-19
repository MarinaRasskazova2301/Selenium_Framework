package com.herokuapp.theinternet.draganddroptests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestUtilities {

    @Test
    public void dragAToBTest() {

        log.info("Starting dragAToBTest");
        WelcomePage welcomePage=new WelcomePage(driver, log);
        welcomePage.openPage();
        DragAndDropPage dragAndDropPage=welcomePage.clickDragAndDropLink();
        dragAndDropPage.dragAToB();

        String columnAText=dragAndDropPage.getColumnAText();
        Assert.assertEquals(columnAText, "B");

        String columnBText=dragAndDropPage.getColumnBText();
        Assert.assertEquals(columnBText, "A");


    }

}
