package email;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class RetrievePasswordTests extends BaseTests {

    @Test
    public void testEmailRetrieval(){
        ForgotPasswordPage forgotPasswordPage = homepage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getSendCheck().contains("Your e-mail's been sent!"));
    }
}
