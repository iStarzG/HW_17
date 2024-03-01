package tests.localTests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.LocalDriveTestRandomData;
import pages.localPages.CombinedTestDrive2Pages;


public class CombinedTest extends LocalTestBase {
    LocalDriveTestRandomData testData = new LocalDriveTestRandomData();
    CombinedTestDrive2Pages combiTest = new CombinedTestDrive2Pages();
    @Test
    @Owner("iStarzG")
    @Tag("Search")
    @DisplayName("Проверка успешного нахождения нужной марки автомобиля на главной странице")
    void succesfulSearchNeedCarTest () {
        combiTest.openPage()
                .modalCheck()
                .inputRandomCar()
                .checkResultsRandomCar(testData.inputCar);


    }


    @Test
    @Owner("iStarzG")
    @Tag("Search")
    @DisplayName("Проверка правильной работоспособности поисковой строки")
    void searchStringTest () {
        combiTest.openPage()
                .inputSearchString(testData.stringValue)
                .setFirstResult()
                .checkName(testData.nameUser);
    }
    @Test
    @Owner("iStarzG")
    @Tag("Search")
    @DisplayName("Проверка перехода с Drive2 на Drom.ru с помощью кнопки Больше машин на дроме")
    void translitionCheckDromTest () {
        combiTest.openPage()
                .translitionDromClick()
                .checkResultTranslitionDrom();
    }

}
