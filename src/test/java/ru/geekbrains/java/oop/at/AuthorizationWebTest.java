package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth(){
        driver.get("https://geekbrains.ru/");
        String login = "glliverx@gmail.com";
        String password = "glliverx123";

        new AuthorizationPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");
    }
}
