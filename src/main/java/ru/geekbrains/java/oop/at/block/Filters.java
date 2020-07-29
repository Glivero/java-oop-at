package ru.geekbrains.java.oop.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters extends PageFactory {

    public Filters(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@id='prof-link'])[1]")
    private WebElement professions;

    @FindBy(xpath = "(//a[@id='free-link'])[1]")
    private WebElement intensives;

    @FindBy(xpath = "(//li[@class='nav-tabs-item']//a)[2]")
    private WebElement courses;

    @FindBy(xpath = "(//input[@class='js-checkbox'])[1]")
    private WebElement freeCourses;

    @FindBy(xpath = "//input[@value='tester']")
    private WebElement testers;

    public WebElement getProfessions() {
        return professions;
    }

    public WebElement getTesters() {
        return testers;
    }

    public WebElement getFreeCourses() {
        return freeCourses;
    }

    public WebElement getIntensives() {
        return intensives;
    }

    public WebElement getCourses() {
        return courses;
    }
}