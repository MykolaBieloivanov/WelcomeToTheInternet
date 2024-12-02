package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.alerts.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{



    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectJavaScriptAlerts();

    }

    @Test
    public void alertJSTest(){
        new AlertsPage(driver).alertJS();
    }

    @Test
    public void alertWithSelectTest(){
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest(){
        new AlertsPage(driver).sendMessageToAlert("Mama Myla Ramu").verifyMessage("Mama Myla Ramu");
    }


}
