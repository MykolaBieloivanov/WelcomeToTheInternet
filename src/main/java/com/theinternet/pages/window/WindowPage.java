package com.theinternet.pages.window;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[text()='Click Here']")
    WebElement newOpenWindow;

    public WindowPage selectClickHere() {
        click(newOpenWindow);


        return new WindowPage(driver);

    }

    public WindowPage switchToNewTab(int index) {

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }


    @FindBy(css = "h3")
    WebElement newWindow;

    public WindowPage verifyNewTabTitle(String text) {
        Assert.assertTrue(shouldHaveText(newWindow, text, 5));
        return this;

    }
}
