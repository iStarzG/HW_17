package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

public class OpenDromTest extends TestBase {
    RegistrationPage testData = new RegistrationPage();
    @Test
    @Tag("OpenDrom")
    void openDromTest () {
        testData.openPage();
    }

}
