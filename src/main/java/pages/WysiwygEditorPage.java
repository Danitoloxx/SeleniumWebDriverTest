package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("button[aria-label='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeID);
    }

    private void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromEdit(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
}
