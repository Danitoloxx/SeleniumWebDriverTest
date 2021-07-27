package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SentMailPage {

    private WebDriver driver;
    private By statusAlert = By.linkText("Internal Server Error");

    SentMailPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlert(){
        return driver.findElement(statusAlert).getText();
    }

}
