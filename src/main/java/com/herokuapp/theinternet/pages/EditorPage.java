package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage extends BasePageObject {

    By iframeLocator = By.tagName("iframe");
    By editorLocator = By.xpath("//*[@id='tinymce']/p");

    public EditorPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public String getEditorText() {
        switchToFrame(iframeLocator);
        waitForVisibilityOf(editorLocator);
        String text = find(editorLocator).getText();
        log.info("Text from TinyMCE WYSIWIG Editor: " + text);
        return text;
    }

}
