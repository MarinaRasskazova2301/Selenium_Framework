package com.herokuapp.theinternet.uploadtests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploadPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends TestUtilities {

    @Test
    public void imageUploadTest() {
        log.info("Starting imageUploadTest");
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        FileUploadPage fileUploadPage = welcomePage.clickFileUploadLink();
        String fileName = "logo.png";
        fileUploadPage.selectFile(fileName);
        fileUploadPage.pushUploadButton();
        String fileNames = fileUploadPage.getUploadedFilesNames();
        Assert.assertTrue(fileNames.contains(fileName));

    }

}
