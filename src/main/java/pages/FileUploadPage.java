package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.xpath("//input[@id='file-upload']");
    private By uploadButton = By.cssSelector("input[id='file-submit']");
    private By uploadFile = By.xpath("//div[@id='uploaded-files']");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadFile).getText();
    }


}
