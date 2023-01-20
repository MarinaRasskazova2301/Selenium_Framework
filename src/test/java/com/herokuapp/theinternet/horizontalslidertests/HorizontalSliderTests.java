package com.herokuapp.theinternet.horizontalslidertests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestUtilities {

    @Test
    public void sliderTest() {
        log.info("Starting HorizontalSliderTests");

        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();
        HorizontalSliderPage horizontalSliderPage = welcomePage.clickHorizontalSliderLink();

        String value="3.5";

        horizontalSliderPage.setSliderTo(value);
        String sliderValue=horizontalSliderPage.getSliderValue();
        Assert.assertEquals(sliderValue, value);

    }


}
