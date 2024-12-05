package com.theinternet.pages.fileupload;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "file-upload")
    WebElement fileUpload;

    @FindBy (id = "file-submit")
    WebElement fileSubmit;


    @FindBy (tagName = "h3")
    WebElement h3;



    public FileUploadPage uploadNewFile(String text) {
        fileUpload.sendKeys(text);
        click(fileSubmit);
        return this;
    }

    public FileUploadPage verifyFile(String text) {
        Assert.assertTrue(h3.getText().contains(text));
        return this;
    }
}
