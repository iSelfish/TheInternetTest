package ua.hotline.PageObjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    public LoginPage goToPage(String page) {
        WebElement authElement = Driver.getDriver().findElement(By.xpath("//li/a[contains(text(),'" + page + "')]"));
        authElement.click();
        return new LoginPage();
    }
}
