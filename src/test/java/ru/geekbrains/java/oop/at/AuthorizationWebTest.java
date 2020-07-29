package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.block.Filters;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;
import ru.geekbrains.java.oop.at.page.ContentPage;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru/");

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");

        String namePage="Курсы";
        ContentPage contentPage = new ContentPage(driver);
        contentPage.getNavigation().getButton(namePage).click();

        Filters filter = new Filters(driver);
        filter.getCourses().click();

        filter.getFreeCourses().click();
        filter.getTesters().click();

        Assertions.assertEquals(contentPage.getTest1().getText(),"Тестирование ПО. Уровень 1");
        Assertions.assertEquals(contentPage.getTest2().getText(),"Тестирование ПО. Уровень 2");
    }
}