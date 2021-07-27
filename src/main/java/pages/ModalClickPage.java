package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ModalClickPage {
    private WebDriver driver;
    private By squareBox = By.cssSelector("div[id='hot-spot']");

    public ModalClickPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickRightBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(squareBox)).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }



}
