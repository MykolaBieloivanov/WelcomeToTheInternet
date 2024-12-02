package com.theinternet.pages.frames;

import com.theinternet.pages.BasePage;
import com.theinternet.pages.alertsframewindows.FramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFrame extends BasePage {

    public IFrame(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iframe;

    public FramePage selectFrames() {
        click(iframe);
        return new FramePage(driver);

    }
}
