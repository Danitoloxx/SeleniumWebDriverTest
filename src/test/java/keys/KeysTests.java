package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class KeysTests extends BaseTest {
    @Test
    public void testBackspace(){
        var keyPage = homepage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered3: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homepage.clickKeyPresses();
        keyPage.enterPi();
    }
}
