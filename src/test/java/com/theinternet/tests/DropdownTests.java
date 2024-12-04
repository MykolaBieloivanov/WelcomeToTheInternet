package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.dropdown.DropdownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownPage();
    }

    @Test
    public void selectAnOptionTest(){
        new DropdownPage(driver).selectAnOption("Option 1");
    }
}
