package com.theinternet.pages;

import com.theinternet.pages.alerts.AlertsPage;
import com.theinternet.pages.dropdown.DropdownPage;
import com.theinternet.pages.frames.IFramePage;
import com.theinternet.pages.slider.SliderPage;
import com.theinternet.pages.window.WindowPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "h1")
    WebElement welcomeToTheInternet;

    public boolean isWelcomeToTheInternetPresent() {
        return welcomeToTheInternet.isDisplayed();
    }


    @FindBy(xpath = "//a[text()='JavaScript Alerts']")
    WebElement javaScriptAlerts;

    public AlertsPage selectJavaScriptAlerts() {
        click(javaScriptAlerts);
        return new AlertsPage(driver);
    }


    @FindBy(xpath = "//a[text()='Frames']")
    WebElement frames;

    public IFramePage getFramePage() {
        click(frames);
        return new IFramePage(driver);
    }


    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iframe;

    public IFramePage selectFrames() {
        click(iframe);
        return new IFramePage(driver);
    }


    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement windows;

    public WindowPage getWindowsPage() {
        click(windows);
        return new WindowPage(driver);
    }


    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdown;

    public DropdownPage getDropdownPage() {
        click(dropdown);
        return new DropdownPage(driver);
    }


    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    WebElement slider;

    public SliderPage getSliderPage() {
        click(slider);
        return new SliderPage(driver);
    }



    @FindBy(xpath = "//a[text()='drag_and_drop']")
    WebElement dragAndDrop;

    public DropdownPage getDragAndDropPage() {
        click(dragAndDrop);
        return new DropdownPage(driver);
    }
}
