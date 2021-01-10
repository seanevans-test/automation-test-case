package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * inputs text into the input field
     * @param text
     */
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    /**
     * returns the result
     * @return
     */
    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
