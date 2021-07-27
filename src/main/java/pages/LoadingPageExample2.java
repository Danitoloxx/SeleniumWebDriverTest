package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingPageExample2 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finishText = By.id("finish");

    public LoadingPageExample2(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(finishText));
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedText(){
        return driver.findElement(finishText).getText();
    }
}
