package com.theinternet.pages.frames;

import com.theinternet.pages.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends BasePage {

    public IFramePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iframe;

    public IFramePage selectFrames() {
        click(iframe);
        return new IFramePage(driver);

    }
}
