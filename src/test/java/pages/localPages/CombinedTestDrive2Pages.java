package pages.localPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.components.LocalDriveTestRandomData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CombinedTestDrive2Pages {
    LocalDriveTestRandomData random = new LocalDriveTestRandomData();
    LocalDriveTestRandomData testData = new LocalDriveTestRandomData();
    private SelenideElement mainModalWindow = $(".o-secondary c-index-makes is-filtered"),
            modalCheckCar = $x("//a[contains(text(),"+"'"+random.inputCar+"')]"),
    checkResultsCar = $(".x-title"),
    stringCheck = $(By.name("text")),
    firstResultName = $(".u-card-link"),
    checkUserName = $x("//span[contains(.,'"+testData.nameUser+"')]"),
    dromClick = $x("//a[contains(text(),'"+testData.dromClickName+"')]"),
    dromVisible = $(testData.dromUrl);


    @Step("Открытие браузера и закрытие футера")
    public CombinedTestDrive2Pages openPage() {
        open("https://www.drive2.ru/");
        return this;
    }
    @Step("Проверка нахождения главного окна выбора авто на главной страницы")
    public CombinedTestDrive2Pages modalCheck() {
        mainModalWindow.shouldBe();
        return this;
    }
    @Step("Выбор рандомной марки автомобиля нажатие кликом")
    public CombinedTestDrive2Pages inputRandomCar () {
        modalCheckCar.click();
        return this;
    }
    @Step("Проверка открытия нужной страницы после выбора марки авто {value}")
    public CombinedTestDrive2Pages checkResultsRandomCar (String value) {
        checkResultsCar.shouldHave(text(random.inputCar));
        return this;
    }
    @Step("Ввод в строку поиска значение {value} и нажатие enter")
    public CombinedTestDrive2Pages inputSearchString (String value) {
        stringCheck.setValue(testData.stringValue).pressEnter();
        return this;
    }
    @Step("Клик на первый результат поиска")
    public CombinedTestDrive2Pages setFirstResult () {
        firstResultName.click();
        return this;
    }
    @Step("Проверка имени создателя поста KBS215")
    public CombinedTestDrive2Pages checkName (String value) {
        checkUserName.shouldBe();
        return this;
    }
    @Step("Клик на кнопку Больше машин на Дроме")
    public CombinedTestDrive2Pages translitionDromClick () {
        dromClick.click();
        return this;
    }
    @Step("Проверка перехода на сайт drom.ru")
    public CombinedTestDrive2Pages checkResultTranslitionDrom () {
        dromVisible.shouldBe();
        return this;

    }
}
