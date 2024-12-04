package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.link.RedirectLinkPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getLinkPage().getRedirectPage();

    }

    @Test
    public void checkLinkTest() {
        new RedirectLinkPage(driver).checkQuantityOfLinks();
    }

    @Test

    public void checkBrokenLinks() {
        new RedirectLinkPage(driver).checkBrokenLinks();
    }
}
