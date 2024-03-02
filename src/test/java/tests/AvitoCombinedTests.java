package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AvitoPerfomancePages;
import pages.components.AvitoTestRandomData;

public class AvitoCombinedTests extends TestBase {
    AvitoPerfomancePages perfomancePages = new AvitoPerfomancePages();
    AvitoTestRandomData randomData = new AvitoTestRandomData();


    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка работоспособности открытия категорий в главном блоке на главной странице")
    void CheckingMainCategoryBlockTest() {
        perfomancePages.openPage()
                .selectRandomCategory(randomData.selectCategory)
                .checkCategoryResult(randomData.selectCategory);
    }

    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка работоспособности кнопки Вход и регистрации")
    void checkingFuncionalityButtonRegistrationTest() {
        perfomancePages.openPage()
                .checkButtonRegistration()
                .checkOpenModule();

    }

    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка выбора города и работоспособности выбора города")
    void checkInputCity() {
        perfomancePages.openPage()
                .clickInputCity()
                .clearCityName()
                .inputCityName(randomData.selectRandomCity)
                .inputOptionCity(randomData.selectRandomCity)
                .clickButtonCityResults()
                .checkResultCitySelect(randomData.selectRandomCity);
    }
    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка работы поисковой строки и вывод необходимых результатов")
    void checkSearchBar () {
        perfomancePages.openPage()
                .inputSearchBar(randomData.randomSearchData)
                .searchResultCheck(randomData.randomSearchData);
    }
    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка наличия и работоспособности кнопки Доставка в блоке Сервисы и услуги Авито")
    void checkButtonDelivery () {
        perfomancePages.openPage()
                //.agreementCity()
                .visibleDeliveryButton()
                .checkDeliveryButton();
    }
    @Test
    @Owner("iStarzG")
    @Tag("Perfomance")
    @DisplayName("Проверка наличия и работоспособности кнопки Автотека")
    void checkButtonAutoteka () {
        perfomancePages.openPage()
                //.agreementCity()
                .buttonAutotekaVisible()
                .buttonAutotekaClick();
    }
}

