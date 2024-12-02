package com.theinternet.pages.alerts;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlert;

    public AlertsPage alertJS() {
        click(jsAlert);
        return this;
    }


    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement confirmButton;


    public AlertsPage selectResult(String result) {
        click(confirmButton);

        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }


    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;

    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPrompt;

    public AlertsPage sendMessageToAlert(String message) {
        click(jsPrompt);

        if (message !=null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }


    @FindBy(id = "result")
    WebElement result1;

    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(result1.getText().contains(text));
        return this;
    }
}
