# Проект автоматизации тестирования главного сайта GeekBrains

Это учебный проект созданный в рамках курса **"Автоматизация тестирования Web UI на Java"**

Автотесты написаны на сайт https://geekbrains.ru/


## Используемые библиотеки
  - [Maven](https://maven.apache.org/)
  - [Selenium](https://www.selenium.dev/)
  - [JUnit](https://junit.org/junit5/)
  - [Allure](http://allure.qatools.ru/)
  - [Hamcrest](http://hamcrest.org/)
  - [AspectJ](https://www.eclipse.org/aspectj/)
  - [WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager) 
  - [Lombok](https://projectlombok.org/) 
  
  ### Запуск проекта
 
Удаление созданных в процессе сборки артефактов:

    mvn clean

Тестирование с помощью JUnit:

    mvn test
    
Вывод отчёта с помощью Allure:

    allure:serve

## Проведенные тесты

 **Авторизация** 
 
 Проверки: 
 
 *- авторизации с корректными данными*
  
 **Поиск**
 
 Проверки: 
 
 *- отображения блоков*
 
 *- количества контента*
  
 **Навигация** 
 
 Проверки: 
 
 *- переход на страницы (Форум, Вебинары, Тесты, Карьера)*
 
 *- функционала без Pop-UP* 
 
 *- нажатие на элемент навигации*
  
 **Поиск по курсам** 
 
 Проверки: 
 
 *- отображения блоков* 
 
 *- страниц Курсы, Бесплатные, Тестирование, Тестирование ПО. Уровень 1, Тестирование ПО. Уровень 2* 
 
 *- работа фильтров*