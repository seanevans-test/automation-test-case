package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage = homepage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testALT(){
        KeyPressesPage keyPressesPage = homepage.clickKeyPresses();
        keyPressesPage.enterText("" + Keys.ALT);
        assertEquals(keyPressesPage.getResult(), "You entered: ALT");
    }

    @Test
    public void testCONTROL(){
        KeyPressesPage keyPressesPage = homepage.clickKeyPresses();
        keyPressesPage.enterText("" + Keys.CONTROL);
        assertEquals(keyPressesPage.getResult(), "You entered: CONTROL");
    }

    @Test
    public void testArrowLeft(){
        KeyPressesPage keyPressesPage = homepage.clickKeyPresses();
        keyPressesPage.enterText("" + Keys.ARROW_LEFT);
        assertEquals(keyPressesPage.getResult(), "You entered: LEFT");
    }
}
