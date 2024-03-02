package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import pages.components.AvitoTestRandomData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AvitoPerfomancePages {
    AvitoTestRandomData randomData = new AvitoTestRandomData();

    private SelenideElement mainBlockCategory = $x("//img[@alt='" + randomData.selectCategory + "']"),
            categoryResult = $(".page-title-text-tSffu"),
            buttonRegistration = $(".index-module-login-K8jzD"),
            moduleLogin = $(".styles-module-root-nvJ_K"),
            clickInputCity = $(".desktop-nev1ty"),
            inputCity = $(".suggest-input-rORJM"),
            buttonClear = $(".icon-icon-jrOym"),
            selectOptionCity = $x("//li[contains(.,'" + randomData.selectRandomCity + "')]"),
            buttonResultCityName = $(".desktop-xujs2d"),
    searchBarName = $(".input-input-Zpzc1"),
    searchResultName = $(".page-title-text-tSffu page-title-inline-zBPFx"),
    buttonDeliveryName = $x("//h4[contains(.,'Доставка')]"),
    closeCity = $(".desktop-smz193"),
    buttonAutotekaName = $x("//h4[contains(.,'Автотека')]");


    @Step("Открытие браузера и нужной страницы")
    public AvitoPerfomancePages openPage() {
        open("https://www.avito.ru/");
        return this;
    }

    @Step("Открытие категории {value} в главном блоке категорий на главной странице")
    public AvitoPerfomancePages selectRandomCategory(String value) {
        mainBlockCategory.click();
        return this;
    }

    @Step("Проверка открытия нужной страницы при выборе категории {value}")
    public AvitoPerfomancePages checkCategoryResult(String value) {
        categoryResult.shouldBe();
        return this;
    }

    @Step("Нажатие на кнопку Вход и регистрация")
    public AvitoPerfomancePages checkButtonRegistration() {
        buttonRegistration.click();
        return this;
    }

    @Step("Проверка открытия модуля логина и регистрации")
    public AvitoPerfomancePages checkOpenModule() {
        moduleLogin.shouldBe();
        return this;
    }

    @Step("Нажатие на кнопку выбора города")
    public AvitoPerfomancePages clickInputCity() {
        clickInputCity.click();
        return this;
    }

    @Step("Нажатие на кнопку очистки предыдущего названия города из поля значения")
    public AvitoPerfomancePages clearCityName() {
        buttonClear.click();
        return this;
    }

    @Step("Ввод в поле названия города {value}")
    public AvitoPerfomancePages inputCityName(String value) {
        inputCity.setValue(randomData.selectRandomCity).sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Нажатие на опцию расширенного поиска города (город, область) {value}")
    public AvitoPerfomancePages inputOptionCity(String value) {
        selectOptionCity.click();
        return this;
    }

    @Step("Нажатие на кнопку Показать объявления")
    public AvitoPerfomancePages clickButtonCityResults() {
        buttonResultCityName.click();
        return this;
    }

    @Step("Проверка изменения города на главной странице на выбранный город {value}")
    public AvitoPerfomancePages checkResultCitySelect(String value) {
        clickInputCity.shouldHave(text(randomData.selectRandomCity));
        return this;
    }
    @Step("Ввод в поисковую строку {value} и нажатие enter")
    public AvitoPerfomancePages inputSearchBar (String value) {
        searchBarName.setValue(randomData.randomSearchData).sendKeys(Keys.ENTER);
        return this;
    }
    @Step("Проверка выдачи результатов при поиске {value} через поисковую строку")
    public AvitoPerfomancePages searchResultCheck (String value) {
        searchResultName.shouldBe();
        return this;
    }
    @Step("Соглашение на выбор предложенного города")
    public AvitoPerfomancePages agreementCity () {
        closeCity.click();
        sleep(2000);
        return this;
    }
    @Step("Проверка наличия кнопки Доставка")
    public AvitoPerfomancePages visibleDeliveryButton () {
        buttonDeliveryName.shouldBe();
        return this;
    }
    @Step("Нажатие и проверка работоспособности кнопки Доставка")
    public AvitoPerfomancePages checkDeliveryButton () {
        buttonDeliveryName.click();
        return this;
    }
    @Step("Проверка наличия кнопки Автотека")
    public AvitoPerfomancePages buttonAutotekaVisible () {
        buttonAutotekaName.shouldBe();
        return this;
    }
    @Step("Нажатие и проверка работоспособности кнопки Автотека")
    public AvitoPerfomancePages buttonAutotekaClick () {
        buttonAutotekaName.click();
        return this;
    }
}

