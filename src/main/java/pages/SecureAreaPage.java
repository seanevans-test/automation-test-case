package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");
    private By logoutButton = By.className("button");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * returns the alert message
     * @return
     */
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    /**
     * logout button to return to LoginPage
     * @return
     */
    public LoginPage ClickLogoutButton(){
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }
}
