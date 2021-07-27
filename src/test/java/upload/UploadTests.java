package upload;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homepage.clickFileUpload();
        uploadPage.uploadFile("E:\\Academy QC\\Selenium Web Driver\\resources\\Pikachu.full.1578983.jpg");
        uploadPage.clickUploadButton();
        assertEquals(uploadPage.getUploadedFiles(),"Pikachu.full.1578983.jpg","Upload File Failed");
    }

}
