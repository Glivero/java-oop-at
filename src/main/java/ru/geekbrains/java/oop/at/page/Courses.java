package ru.geekbrains.java.oop.at.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.java.oop.at.block.Filters;

import static org.openqa.selenium.support.PageFactory.initElements;

public class Courses {
    private ContentPage contentPage;
    private Filters filter;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    public Courses(WebDriver driver) {
        initElements(driver, this);
        filter = new Filters(driver);
    }

    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }
}