package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends BasePageObject {

    private By horizontalSliderLocator = By.xpath("//input[@type='range']");

    public HorizontalSliderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void setSliderTo(String value) {
        // Move slider normal method
        // Find the xOffset using given value
        // int width = find(sliderLocator).getSize().getWidth();
        // double percent = Double.parseDouble(value) / 5;
        // int xOffset = (int) (width * percent);

        // Actions action = new Actions(driver);
        // action.dragAndDropBy(find(sliderLocator), xOffset, 0).build().perform();

        // Workaround method
        // Calculate number of steps
        int steps = (int) (Double.parseDouble(value) / 0.5);

        // Perform steps
        pressKey(horizontalSliderLocator, Keys.ENTER);
        for (int i = 0; i < steps; i++) {
            pressKey(horizontalSliderLocator, Keys.ARROW_RIGHT);

        }

    }

    public String getSliderValue() {

        return find(horizontalSliderLocator).getAttribute("value");
    }
}
