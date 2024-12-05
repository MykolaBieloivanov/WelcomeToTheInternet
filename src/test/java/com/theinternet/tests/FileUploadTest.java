package com.theinternet.tests;

import com.theinternet.pages.HomePage;
import com.theinternet.pages.fileupload.FileUploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{


    @BeforeMethod
    public void  precondition(){
        new HomePage(driver).getFileUploadPage();
    }

    @Test
    public void fileUploadTest (){
       new FileUploadPage(driver).uploadNewFile("C:/Tools/33.jpg")
               .verifyFile("File Uploaded!");
    }
}
