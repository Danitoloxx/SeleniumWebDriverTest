package base;


import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    private EventFiringWebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver91.exe"); //setear la ubicacion del chromedriver
        driver = new EventFiringWebDriver(new ChromeDriver()); // Instancia el web driver de la clase ChromeDriver
        driver.register(new EventReporter());
//        driver.get("https://the-internet.herokuapp.com/");
        goHome();
        driver.manage().window().maximize(); //para manejar el tamaño de la ventana que se abre.
        homepage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){ //Se crea un metodo que te vuelve a la pagina principal,.
        driver.get("https://the-internet.herokuapp.com/"); //Cuando se abre el explorador te dirije a la pagina
    }

    @AfterClass
    public void tearDown(){
        driver.quit(); //cierra la sesion del web driver.
    }

    @AfterMethod
    public void recordFailures(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}


/*
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContent.click(); //HACE CLICK EN EL ELEMENTO ENCONTRADO
//        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElement.click(); //HACE CLICK EN EL ELEMENTO ENCONTRADO
//        List<WebElement> links = driver.findElements(By.tagName("li"));
//        System.out.println(links.size()); //obtiene la cantidad de elementos que hay en una lista (
//        System.out.println(driver.getTitle()); //obtiene el titulo de la pagina que entra
*/