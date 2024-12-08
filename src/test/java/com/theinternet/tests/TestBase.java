package com.theinternet.tests;

import com.theinternet.pages.app.ApplicationManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager(System.getProperty("browser","chrome"));
    public WebDriver driver;

    @BeforeMethod
    public void init(){
       driver = app.startTest();
    }


    @AfterMethod(enabled = true)
    public void tearDown(){
        app.stopTest();
    }

}
