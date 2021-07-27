package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigator(){
        homepage.clickDynamicLoading().clickLoadingPages();
        getWindowManager().goBack();
        getWindowManager().goRefresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTo(){
        homepage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchToNewTab(){
        var buttonPage = homepage.clickDynamicLoading().rightClickOnExample2();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is displayed");
    }
}
