package com.theinternet.pages.broken_images;

import com.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesPage extends BasePage  {

    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> images;

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



    public BrokenImagesPage checkBrokenImages() {
        System.out.println(images.size() + " -- QUANTITY OF IMAGES");
        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String imageURL = element.getDomAttribute("src");

            // пришлось импортировать метод из другого класса (дублируется получатеся)
            verifyLinks(imageURL);
            try {
                boolean imageDisplayed = (Boolean)

                        //не обьявленна переменная и я не могу догнать, где мы ее обьявляли?
                        //не писал JS тесты и поплатился за это
                        js.executeScript("return (typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);", element);
                if (imageDisplayed) {
                    System.out.println("DISPLAYED - OK");
                } else {
                    System.out.println("DISPLAYED IS BROKEN");
                    System.out.println("===================");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }

        return this;
    }
}
