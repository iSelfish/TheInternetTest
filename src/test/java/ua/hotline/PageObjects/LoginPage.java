package ua.hotline.PageObjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.Driver.getDriver;


public class LoginPage {
    private By usernameInputField = By.xpath("//input[@id='username']");
    private By passwordInputField = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage waitForLoginPage() {
        Driver.getDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='example']/h2")));
        return new LoginPage();
    }

    public SecureAreaPage loginWithCredentials(String login, String password) {
        WebElement usernameInputFieldElement = getDriver().findElement(usernameInputField);
        WebElement passwordInputFieldElement = getDriver().findElement(passwordInputField);
        WebElement loginButtonElement = getDriver().findElement(loginButton);
        usernameInputFieldElement.sendKeys(login);
        passwordInputFieldElement.sendKeys(password);
        loginButtonElement.click();
        return new SecureAreaPage();
    }
}
