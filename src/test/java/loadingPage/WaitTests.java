package loadingPage;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homepage.clickDynamicLoading().clickLoadingPages();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded incorrect text!");
    }
}
