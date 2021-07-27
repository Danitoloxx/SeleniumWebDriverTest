package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownJSPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropdownJSPage(WebDriver driver){
        this.driver = driver;
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement((dropDown)));
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSekectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void addMultipleAttribute(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, findDropDownElement());
    }

}
