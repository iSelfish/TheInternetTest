package ua.hotline.PageObjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static core.Driver.getDriver;

public class SecureAreaPage {
    private final By flashMessages = By.xpath("//div[@id='flash']");

    public SecureAreaPage waitForSecureAreaPage() {
        Driver.getDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text() = 'Welcome to the Secure Area. When you are done click logout below.']")));
        return new SecureAreaPage();
    }

    public String getTextFromFlashMessages() {
        WebElement flashMessagesElement = getDriver().findElement(flashMessages);
        return flashMessagesElement.getText();
    }
}
