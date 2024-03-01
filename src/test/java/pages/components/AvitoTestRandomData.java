package pages.components;

import com.github.javafaker.Faker;

import java.util.Locale;

public class AvitoTestRandomData {
    static Faker faker = new Faker(new Locale("ru"));
   public String selectCategory = faker.options().option("Авто", "Недвижимость", "Работа", "Одежда, обувь, аксессуары",
           "Хобби и отдых", "Животные", "Готовый бизнес и оборудование", "Распродажа техники", "Услуги", "Электроника","Для дома и дачи",
           "Запчасти","Для детей","Жильё посуточно","Красота и здоровье");
}
