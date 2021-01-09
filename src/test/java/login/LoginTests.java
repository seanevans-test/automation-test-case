package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testIncorrectPassword(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("wrongPASSWORD!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue(loginPage.getFailureAlert().contains("Your password is invalid!"));
    }

    @Test
    public void testIncorrectUsername(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("thomassmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue(loginPage.getFailureAlert().contains("Your username is invalid!"));
    }

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        assertTrue("Alert text is incorrect",
                secureAreaPage.getAlertText()
                                .contains("You logged into a secure area!"));
    }
}



