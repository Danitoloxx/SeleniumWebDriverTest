package recovery;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.SentMailPage;

import static org.testng.Assert.assertTrue;

public class recoveryTest extends BaseTest {

    @Test
    public void testRecoverySuccefull(){
        ForgotPassword forgotpassword = homepage.clickForgotPassword();
        forgotpassword.setEmail("tau@example.com");
        SentMailPage sentMailPage = forgotpassword.clickRecoveryButton();
        assertTrue(true);
    }
}
