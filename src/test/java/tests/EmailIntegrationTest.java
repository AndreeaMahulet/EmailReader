package tests;

import net.bytebuddy.utility.RandomString;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import tools.constants.EnvironmentConstants;
import tools.models.MailReceiver;

@RunWith(SerenityRunner.class)
public class EmailIntegrationTest {

    protected String boardName = RandomString.make(10);

    @Before
    public void setup() {
//                System.setProperty("https.proxyHost", "localhost");
//                System.setProperty("https.proxyPort", "8080");
        System.setProperty("env", "test-env");
    }
    @Test
    public void EmailIntegration() throws InterruptedException {

        MailReceiver.verifyLastEmail(EnvironmentConstants.SECONDARY_USERNAME, EnvironmentConstants.SECONDARY_USERNAME_PASSWORD);
    }


    @After
    public void tearDown() {
    }
}
