package pages.localPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationDrive2Page {
    private SelenideElement
            buttonRegistration = $(".o-group > .c-button:nth-child(2)"),
            buttonSubmit = $(".c-button--alt-l:nth-child(2)"),
            mailCheck = $(".field-validation-error"),
            inputMail = $("#Email"),
            inputPhone = $("#Phone"),
            modalCheck = $(".x-text o-b-xs");

    @Step("Открытие браузера и закрытие футера")
    public RegistrationDrive2Page openPage() {
        open("https://www.drive2.ru/");
        return this;
    }

    @Step("Нажатие на кнопку Зарегистрироваться")
    public RegistrationDrive2Page buttonRegClick() {
        buttonRegistration.shouldHave(text("Зарегистрироваться")).click();
        return this;
    }

    @Step("Нажатие ентера")
    public RegistrationDrive2Page buttonSubmit() {
        buttonSubmit.pressEnter();
        return this;
    }

    @Step("Проверка предупреждения Укажите адрес электронной почты")
    public RegistrationDrive2Page mailCheckOut() {
        mailCheck.shouldHave(text("Укажите адрес электронной почты"));
        return this;
    }
    @Step("Ввод адреса почты {value}")
    public RegistrationDrive2Page inputCurrentMail(String value) {
        inputMail.setValue(value);
        return this;
    }
    @Step("Ввод номера телефона {value}")
    public RegistrationDrive2Page inputCurrentPhoneAndPressEnter(String value) {
        inputPhone.setValue(value).pressEnter();
        return this;
    }
    @Step("Проверка прохода регистрации на следующий этап")
    public RegistrationDrive2Page modalOpenCheckResults () {
        modalCheck.shouldBe();
        return this;
    }
}
