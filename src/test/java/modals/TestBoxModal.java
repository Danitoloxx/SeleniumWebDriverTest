package modals;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBoxModal extends BaseTest {
    @Test
    public void testRightClick(){
        var modalClickPage = homepage.clickModalPage();
        modalClickPage.clickRightBox();
        String message = modalClickPage.getPopUpText();
        modalClickPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
