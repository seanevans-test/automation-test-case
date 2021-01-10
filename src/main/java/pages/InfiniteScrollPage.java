package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Scrolls intil the paragraph with index specified is in view
     * @param index
     */

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while (getNumberofParagraphsPresent() < index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberofParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }

}
