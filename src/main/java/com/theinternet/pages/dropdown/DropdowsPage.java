package com.theinternet.pages.dropdown;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdowsPage extends BasePage {

    public DropdowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "dropdown")
    WebElement dropdown;

    public DropdowsPage selectAnOption(String option) {

        Select select = new Select(dropdown);

        select.selectByVisibleText("Option 1");
        return this;
    }
}
