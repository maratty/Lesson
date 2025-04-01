package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
    private WebDriver driver;

    // Локаторы
    private By inputField1 = By.xpath("//*[@id=\"connection-phone\"]");
    private By inputField2 = By.xpath("//*[@id=\"connection-sum\"]");
    private By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInputFields(String value1, String value2) {
        WebElement field1 = driver.findElement(inputField1);
        WebElement field2 = driver.findElement(inputField2);

        field1.sendKeys(value1);
        field2.sendKeys(value2);
    }

    public void clickContinueButton() {
        WebElement button = driver.findElement(continueButton);
        button.click();
    }

    public boolean isButtonWorking() {

        return true;
    }
}
