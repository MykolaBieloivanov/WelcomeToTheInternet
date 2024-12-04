package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.broken_images.BrokenImagesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImageTest extends TestBase {


    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectBrokenImages();
    }


    @Test
    public void brokenImagesTest(){
        new BrokenImagesPage(driver).checkBrokenImages();
    }

}
