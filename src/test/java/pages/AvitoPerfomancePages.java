package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.AvitoTestRandomData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AvitoPerfomancePages {
AvitoTestRandomData randomData = new AvitoTestRandomData();

    private SelenideElement mainBlockCategory = $x("//img[@alt='"+randomData.selectCategory+"']"),
    categoryResult = $(".page-title-text-tSffu");

@Step("Открытие браузера и нужной страницы")
    public AvitoPerfomancePages openPage () {
        open("https://www.avito.ru/");
        return this;
    }
    @Step("Открытие категории {value} в главном блоке категорий на главной странице")
    public AvitoPerfomancePages selectRandomCategory (String value) {
        mainBlockCategory.click();
        return this;
    }
    @Step("Проверка открытия нужной страницы при выборе категории {value}")
    public AvitoPerfomancePages checkCategoryResult (String value) {
        categoryResult.shouldHave(text(randomData.selectCategory));
        return this;
    }
}

