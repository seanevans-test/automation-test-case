package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * link to Loginpage
     * @return
     */
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    /**
     * Link to InfiniteScrollPage
     * @return
     */
    public InfiniteScrollPage clickInfiniteScrollPage(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    /**
     * link to KeyPressesPage
     * @return
     */
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    /**
     * link to ForgotPasswordPage
     * @return
     */

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
