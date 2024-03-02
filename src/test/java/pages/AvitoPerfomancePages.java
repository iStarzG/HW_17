package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import pages.components.AvitoTestRandomData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
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
    deliveryCheckResultName = $(".header-section-about-_KT2g"),
    closeCity = $(".desktop-smz193"),
    buttonAutotekaName = $x("//h4[contains(.,'Автотека')]"),
    autotekaResult = $(".header-main-title-TDDlr"),
    tableCalendarName = $x("//div/div/div/div/table/tbody/tr[3]/td[3]/div"),
    tableCalendarDualName = $x("//div[2]/table/tbody/tr[4]/td[6]/div"),
    calendarCloseName = $x("//div[2]/div/div/div/div/div[2]/button/span"),
    randomAddName = $x("//div[5]/div/div/div[2]/div/a/h3"),
    addNameVisible = $(".style-title-info-_liyt"),
    buttonHelpName = $x("//a[contains(text(),'Помощь')]"),
    helpResultName = $("._1agAUwZfOLyww_mmrX31X0"),
    favoritesButtonName = $(".desktop-1l3k1vq"),
    buttonClickFavoritesName = $(".desktop-1gzlbya"),
    favoritesName = $(".index-container-MxQrS");


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
        sleep(2000);
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
    @Step("Проверка открытия нужной страницы Авито Доставка")
    public AvitoPerfomancePages checkResultDelivery () {
        sleep(5000);
        deliveryCheckResultName.$(byText("Авито Доставка"));
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
    @Step("Проверка открытия нужной страницы")
    public AvitoPerfomancePages autotekaResultsCheck () {
        sleep(5000);
        autotekaResult.shouldBe();
        return this;
    }
    @Step("Открытие страницы Онлайн-бронирование жилья")
    public AvitoPerfomancePages openPageRent () {
        open("https://www.avito.ru/all/kvartiry/sdam/posutochno/-ASgBAgICAkSSA8gQ8AeSUg?f=ASgBAQICAkSSA8gQ8AeSUgFAlC4Utr4C");
        return this;
    }
    @Step("Выбор в календаре день заезда")
    public AvitoPerfomancePages selectFirstDate () {
        tableCalendarName.click();
        return this;
    }
    @Step("Выбор в календаре день выезда")
    public AvitoPerfomancePages selectEndDate () {
        tableCalendarDualName.click();
        return this;
    }
    @Step("Клик и проверка закрытия календаря")
    public AvitoPerfomancePages calendarClose () {
        calendarCloseName.click();
        return this;
    }
    @Step("Открытие предложенного объявления")
    public AvitoPerfomancePages openAdd () {
        randomAddName.click();
        return this;
    }
    @Step("Проверка открытия объявления")
    public AvitoPerfomancePages visibleOpenPage () {
        sleep(5000);
        addNameVisible.shouldBe();
        return this;
    }
    @Step("Нажатие кнопки Помощь")
    public AvitoPerfomancePages clickButtonHelp () {
        sleep(2000);
        buttonHelpName.click();
        return this;
    }
    @Step("Проверка работоспособности кнопки Помощь и открытия нужной страницы")
    public AvitoPerfomancePages  checkResultHelpButton () {
        sleep(2000);
        helpResultName.shouldBe();
        return this;
    }
    public AvitoPerfomancePages clickFavoritesButton () {
        favoritesButtonName.click();
        return this;
    }
    public AvitoPerfomancePages openPageFavorite () {
        open("https://www.avito.ru/ekaterinburg/kvartiry/1-k._kvartira_32m_45et._3821896165");
        return this;
    }
    public AvitoPerfomancePages buttonClickFavorites () {
        buttonClickFavoritesName.click();
        return this;
    }
    public AvitoPerfomancePages checkFavorites () {
        favoritesName.shouldHave(text("Избранное"));
        return this;
    }
}

