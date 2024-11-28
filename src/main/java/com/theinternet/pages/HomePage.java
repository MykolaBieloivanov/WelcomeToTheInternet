package com.theinternet.pages;

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
}
