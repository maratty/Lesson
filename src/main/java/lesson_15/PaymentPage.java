package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaymentPage {
    private WebDriver driver;

    // Локатор для логотипов платёжных систем
    private By paymentLogos = By.cssSelector("#pay-section > div > div > div.col-12.col-xl-8 > section > div > div.pay__partners");

    // Конструктор
    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для получения списка логотипов платёжных систем
    public List<WebElement> getPaymentLogos() {
        return driver.findElements(paymentLogos);
    }
}
