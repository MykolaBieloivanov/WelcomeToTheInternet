package com.theinternet.pages.draganddrop;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "column-a")
    WebElement columna;

    @FindBy (id = "column-b")
    WebElement columnb;

    public DragAndDropPage actionDragMe() {


        new Actions(driver).dragAndDrop(columna,columnb).perform();
        return this;
    }

    public DragAndDropPage verifyDropped(String text) {
//        ?????Assert.assertTrue(shouldHaveText());
        return this;
    }
}
