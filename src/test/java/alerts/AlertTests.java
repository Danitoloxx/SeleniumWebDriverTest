package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homepage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You successfully clicked an alert", "Result Text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homepage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testPromptTextAlert(){
        var alertsPage = homepage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Tu vieja en tanga";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You entered: " + text, "Alert text incorrect");
    }
}
