package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePageObject {

    By chooseFileFieldLocator = By.id("file-upload");
    By uploadButtonLocator = By.id("file-submit");
    By uploadedFilesLocator = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectFile(String fileName) {

        log.info("Selecting '" + fileName + "' file from Files folder");
        String filePath = System.getProperty("user.dir") + "//src//main//resources//files//" + fileName;
        type(filePath, chooseFileFieldLocator);
        log.info("File selected");

    }

    public void pushUploadButton() {
        log.info("Clicking on upload button");
        click(uploadButtonLocator);
    }

    public String getUploadedFilesNames() {
        waitForVisibilityOf(uploadedFilesLocator);
        System.out.println("Wait is over");
        String names = find(uploadedFilesLocator).getText();
        log.info("Uploaded files: " + names);
        return names;
    }

}



