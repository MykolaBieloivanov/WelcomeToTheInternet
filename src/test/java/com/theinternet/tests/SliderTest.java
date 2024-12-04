package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.slider.SliderPage;
import com.theinternet.pages.window.WindowPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getSliderPage();
    }

    @Test
    public void sliderTest(){
        new SliderPage(driver).moveSliderInHorizontalDirection()
                .verifySliderValue("3");



    }


}
