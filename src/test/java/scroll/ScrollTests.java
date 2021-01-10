package scroll;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

import static org.testng.Assert.assertTrue;

public class ScrollTests extends BaseTests {

    @Test
    public void testInfiniteScroll(){
        InfiniteScrollPage infiniteScrollPage = homepage.clickInfiniteScrollPage();
        infiniteScrollPage.scrollToBottom(5);
        infiniteScrollPage.scrollToBottom(9);
        infiniteScrollPage.scrollToTop();
        assertTrue(infiniteScrollPage.getHeaderText().contains("Infinite Scroll"));
    }
}
