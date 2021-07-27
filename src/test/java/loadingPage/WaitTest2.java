package loadingPage;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest2 extends BaseTest {
    @Test
    public void testWaitUntilDom(){
        var loadingPage = homepage.clickDynamicLoading().clickLoadingPages2();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "No Hello World");
    }
}
