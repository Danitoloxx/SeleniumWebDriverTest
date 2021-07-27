package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver; //Se crea la variable driver de tipo webdriver
    private By usernameField = By.id("username"); // se crean las variables usernameField, passwordField y loginButton de tipo by
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver); //
    }

}
