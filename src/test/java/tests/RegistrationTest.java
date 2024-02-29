package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.TestRandomData;

public class RegistrationTest extends TestBase{
    TestRandomData testRandomData = new TestRandomData();
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    @Owner("iStarzG")
    @Tag("Registration")
    @DisplayName("Проверка ошибки регистрации с пустыми полями")
    void registrationWithEmptyValues () {
        registrationPage.openPage()
                .buttonRegClick()
                .buttonSubmit()
                .mailCheckOut();

    }
    @Test
    @Owner("iStarzG")
    @Tag("Registration")
    @DisplayName("Вывод на следующий этап регистрации после введения почты и телефона")
    void SuccesfulRegistrationWithMailAndNumber () {
        registrationPage.openPage()
                .buttonRegClick()
                .inputCurrentMail(testRandomData.emailName)
                .inputCurrentPhoneAndPressEnter(testRandomData.numberPhone)
                .modalOpenCheckResults();

    }
}
