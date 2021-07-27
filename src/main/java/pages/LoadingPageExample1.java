package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingPageExample1 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingIndication = By.id("loading");
    private By finishText = By.id("finish");

    public LoadingPageExample1(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10); //Ejemplo del WebDriverWait
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingIndication)));

        FluentWait wait = new FluentWait(driver) //Ejemplo del FluentWait
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndication)));
    }

    public String getLoadedText(){
        return driver.findElement(finishText).getText();
    }
}
