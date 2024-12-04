package com.theinternet.pages.dropdown;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "dropdown")
    WebElement dropdown;

    public DropdownPage selectAnOption(String option) {
        Assert.assertTrue(shouldHaveText(dropdown, option, 5));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        return this;
    }

}

