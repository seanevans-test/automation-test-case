package scroll;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class ScrollTests extends BaseTests {

    @Test
    public void testScrollToBottomParagraph(){
        homepage.clickInfiniteScrollPage().scrollToParagraph(5);
    }
}
