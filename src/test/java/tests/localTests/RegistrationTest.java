package tests.localTests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.LocalDriveTestRandomData;
import pages.localPages.RegistrationDrive2Page;


public class RegistrationTest extends LocalTestBase {
    LocalDriveTestRandomData testRandomDriveData = new LocalDriveTestRandomData();
    RegistrationDrive2Page registrationDrive2Page = new RegistrationDrive2Page();
    @Test
    @Owner("iStarzG")
    @Tag("Registration")
    @DisplayName("Проверка ошибки регистрации с пустыми полями")
    void registrationWithEmptyValues () {
        registrationDrive2Page.openPage()
                .buttonRegClick()
                .buttonSubmit()
                .mailCheckOut();

    }
    @Test
    @Owner("iStarzG")
    @Tag("Registration")
    @DisplayName("Вывод на следующий этап регистрации после введения почты и телефона")
    void SuccesfulRegistrationWithMailAndNumber () {
        registrationDrive2Page.openPage()
                .buttonRegClick()
                .inputCurrentMail(testRandomDriveData.emailName)
                .inputCurrentPhoneAndPressEnter(testRandomDriveData.numberPhone)
                .modalOpenCheckResults();

    }
}
