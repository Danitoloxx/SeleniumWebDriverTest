package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class javascriptTest extends BaseTest {
    @Test
    public void testScrollTable(){
        homepage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homepage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
