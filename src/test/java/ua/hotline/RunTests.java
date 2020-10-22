package ua.hotline;

import core.Driver;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ua.hotline.PageObjects.StartPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RunTests {

    @Before
    public void basicConfigure(){
        BasicConfigurator.configure();
    }
    @After
    public void killDriver() {
        Driver.kill();
    }

    @Test
    public void firstTest() {
        String testLoginMessage;
        testLoginMessage = new StartPage()
                .navigateTo("https://the-internet.herokuapp.com/")
                .goToPage("Form Authentication")
                .waitForLoginPage()
                .loginWithCredentials("tomsmith", "SuperSecretPassword!")
                .waitForSecureAreaPage()
                .getTextFromFlashMessages();

        assertTrue(testLoginMessage.contains("You logged into a secure area!"));
    }

}
