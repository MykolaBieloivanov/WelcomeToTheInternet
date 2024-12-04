package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.draganddrop.DragAndDropPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropPageTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragAndDropPage();
    }


    @Test
    public void actionDragMeTest(){
        new DragAndDropPage(driver).actionDragMe()
                .verifyDropped("Dropped");
    }
}
