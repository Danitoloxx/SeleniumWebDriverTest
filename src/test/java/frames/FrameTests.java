package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {
    @Test
    public void testWysiwig(){
        var editorPage = homepage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEdit(), text1+text2, "Text frame error");

    }
}
