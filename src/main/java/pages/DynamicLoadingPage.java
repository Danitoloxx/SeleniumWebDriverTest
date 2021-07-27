package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By linkElementHidden = By.cssSelector("a[href='/dynamic_loading/1']");
    private By linkElementFact = By.cssSelector("a[href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public LoadingPageExample1 clickLoadingPages(){
        driver.findElement(linkElementHidden).click();
        return new LoadingPageExample1(driver);
    }

    public LoadingPageExample2 clickLoadingPages2(){
        driver.findElement(linkElementFact).click();
        return new LoadingPageExample2(driver);
    }

    public LoadingPageExample2 rightClickOnExample2(){
        driver.findElement(linkElementFact).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new LoadingPageExample2(driver);
    }
}
