package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInputField = By.id("email");
    private By retrievePasswordField = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){this.driver = driver;}

    public void setEmail(String email){driver.findElement(emailInputField).sendKeys(email);}


}
