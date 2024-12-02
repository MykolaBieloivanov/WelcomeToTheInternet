package com.theinternet.pages;

import com.theinternet.pages.alerts.AlertsPage;
import com.theinternet.pages.alertsframewindows.FramePage;
import com.theinternet.pages.dropdown.DropdowsPage;
import com.theinternet.pages.window.WindowPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{



    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement welcomeToTheInternet;

        public boolean isWelcomeToTheInternetPresent(){
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


    public FramePage getFramePage() {
        click(frames);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//a[text()='iFrame']")
    WebElement iframe;

    public FramePage selectFrames() {
        click(iframe);
        return new FramePage(driver);

    }


    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement windows;


    public WindowPage getWindowsPage() {
        click(windows);
        return new WindowPage(driver);
    }


    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropdown;

    public DropdowsPage getDropdownPage(){
        click(dropdown);
        return new DropdowsPage(driver);
    }
}
