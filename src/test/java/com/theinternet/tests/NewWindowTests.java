package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.window.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWindowsPage();
        new WindowPage(driver).selectClickHere();
    }


    @Test
    public void newTabTest(){
        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("New Window");
    }
}
