package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePageObject{

    By dropdownLocator= By.id("dropdown");




    public DropdownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectOption(int option){
        log.info("Selecting option %d", option);
        Select dropdown=new Select(find(dropdownLocator));
        dropdown.selectByValue(""+option);
    }

    public String getSelectedOption(){
        Select dropdown=new Select(find(dropdownLocator));
        String selectedOption=dropdown.getFirstSelectedOption().getText();
        log.info("selected option is %s", selectedOption);
        return selectedOption;
    }

}
