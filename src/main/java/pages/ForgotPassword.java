package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    //Atributos
    private WebDriver driver; //Variable de tipo WebDriver privada
    private By recoveryField = By.id("email"); //Variable de tipo By
    private By recoveryButton = By.cssSelector("button[class='radius']"); //Variable de tipo By

    //Metodo Constructor
    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    //Metodo para enviar string email al input
    public void setEmail(String email){
        driver.findElement(recoveryField).sendKeys(email);
    }
     //Metodo para hacer click
    public SentMailPage clickRecoveryButton(){
        driver.findElement(recoveryButton).click();
        return new SentMailPage(driver);
    }
}
