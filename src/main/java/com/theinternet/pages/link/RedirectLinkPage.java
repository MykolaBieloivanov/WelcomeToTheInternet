package com.theinternet.pages.link;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class RedirectLinkPage extends BasePage {

    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "redirect")
    WebElement redirect;

    public RedirectLinkPage getRedirectPage() {
        click(redirect);
        return new RedirectLinkPage(driver);
    }

    @FindBy(css = "a")
    List<WebElement> allLinks;

    public RedirectLinkPage checkQuantityOfLinks() {
        System.out.println("Links on the page: -->  " + allLinks.size());
//        Iterator<WebElement> iterator = allLinks.iterator();
        return this;
    }


    public RedirectLinkPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getDomAttribute("href");
            verifyLinks(url);

        }
        return this;
    }

    public void verifyLinks(String url) {
        try {

            URL linkUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) linkUrl.openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            if (connection.getResponseCode() >= 400) {
                System.out.println(url + " BROKEN LINK " + connection.getResponseMessage());
            } else {
                System.out.println(url + "  NORMAL VARIK  " + connection.getResponseMessage());
            }
        } catch (Exception e) {
            System.out.println(url + " -- " + e.getMessage() + "--> ERROR");
        }
    }

}
