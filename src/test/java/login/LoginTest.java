package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessFullLogin(){
        LoginPage loginpage = homepage.clickFormAuthentication();
        loginpage.setUsername("tomsmith");
        loginpage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginpage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
