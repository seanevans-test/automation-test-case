package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue("Alert text is incorrect",
                secureAreaPage.getAlertText()
                                .contains("You logged into a secure area! x"));
    }
}
