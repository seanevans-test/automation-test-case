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
     * Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToBottom(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while (getNumberofParagraphsPresent() < index){
            jsExecutor.executeScript(script);
        }
    }

    /**
     * Scrolls back to the 0,0 co-ordinates
     */
    public void scrollToTop(){
        var jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript("window.scrollTo(0, 0)");
    }

    /**
     * Counts the number of textBlocks
     * @return int
     */
    private int getNumberofParagraphsPresent(){
        return driver.findElements(textBlocks).size();
    }

    /**
     * Finds the h3 element on the page and returns text
     * @return String
     */
    public String getHeaderText(){
        return driver.findElement(By.tagName("h3")).getText();
    }
}

