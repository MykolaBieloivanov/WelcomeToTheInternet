package com.theinternet.pages.slider;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (css =".range")
    WebElement sliderInput;

    public SliderPage moveSliderInHorizontalDirection() {
        //??????
        new Actions(driver).dragAndDropBy(sliderInput,3,0).perform();
        return this;
    }

    public SliderPage verifySliderValue(String number) {
        Assert.assertEquals(sliderInput.getDomAttribute("range"), number);
        return this;
    }
}
