package pages.components;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestRandomData {
    static Faker faker = new Faker(new Locale("ru"));
  public String emailName = faker.internet().emailAddress(String.valueOf(new Locale("en"))),
  numberPhone = faker.phoneNumber().phoneNumber(),
    inputCar = faker.options().option("Audi", "BMW", "Mercedes-Benz", "Toyota", "Ford", "MINI", "Mitsubishi", "KIA","Skoda", "Volvo"),
    nameUser = ("KBS215"),
    stringValue = ("Toyota Avensis KBS215"),
  dromClickName = ("Посмотреть больше машин на Дроме"),
    dromUrl = ("[href=https://www.drom.ru]");
}
