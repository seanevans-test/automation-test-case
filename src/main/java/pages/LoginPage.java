package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By flashMessage = By.id("flash");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * allows input into the username field
     * @param username
     */
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    /**
     * allows input into the password field
     * @param password
     */
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    /**
     * presses the login button, validating the username and password
     * @return
     */
    public SecureAreaPage ClickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    /**
     * returns the flash message after failed login
     * @return
     */
    public String getFlashMessage(){
        return driver.findElement(flashMessage).getText();
    }
}
