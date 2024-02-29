package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CombinedTestPages;
import pages.components.TestRandomData;

public class CombinedTest extends TestBase{
    TestRandomData testData = new TestRandomData();
    CombinedTestPages combiTest = new CombinedTestPages();
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
