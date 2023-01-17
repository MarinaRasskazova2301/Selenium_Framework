package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePageObject{

    private By checkbox= By.xpath("//input[@type='checkbox']");

    public CheckboxesPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectAllCheckboxes(){
        log.info("Checking all unchecked checkboxes");
        List<WebElement> checkboxes=findAll(checkbox);
        checkboxes.stream().filter(e->!e.isSelected()).forEach(WebElement::click);
    }

    public Boolean AreAllCheckboxesChecked(){
        log.info("Verifying that all checkboxes are checked");
        List<WebElement> checkboxes=findAll(checkbox);
        return checkboxes.size()==checkboxes.stream().filter(WebElement::isSelected).count();
    }



}
