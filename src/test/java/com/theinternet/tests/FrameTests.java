package com.theinternet.tests;

import com.theinternet.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFramePage();
    }

    @Test
    public void frameTest() {
        new HomePage(driver).selectFrames();

    }
}
