package nested;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {
    @Test
    public void testFramesText(){
        var nestedFramePages = homepage.clickFramesEditor().clickNestedFrames();
        assertEquals(nestedFramePages.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramePages.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");;
    }

}
