package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;

    // Локаторы для полей
    private By[] fields = {
        By.id("connection-phone"),
        By.id("connection-sum"),
        By.id("connection-email")
    };

    // Ожидаемые надписи для каждого поля
    private String[] expectedLabels = {
        "Номер телефона",
        "Сумма",
        "E-mail для отправки чека"
    };

    // Локаторы для надписей
    private By[] labels = {
        By.xpath("//*[@id=\"connection-phone\"]"),
        By.xpath("//*[@id=\"connection-sum\"]"),
        By.xpath("//*[@id=\"connection-email\"]")
    };

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLabelText(int index) {
        return driver.findElement(labels[index]).getText();
    }

    public String getExpectedLabel(int index) {
        return expectedLabels[index];
    }

    public int getFieldCount() {
        return fields.length;
    }
}