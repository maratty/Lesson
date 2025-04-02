package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PaymentLogosPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Локатор для логотипов платежных систем (замените на ваш XPath)
    private By paymentLogoLocator = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]"); // Пример XPath для логотипов

    public PaymentLogosPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Установите время ожидания
    }

    // Метод для проверки наличия логотипов платежных систем
    public boolean arePaymentLogosPresent() {
        try {
            // Ожидание появления логотипов
            List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(paymentLogoLocator));
            return !logos.isEmpty(); // Возвращаем true, если логотипы найдены
        } catch (Exception e) {
            return false; // Возвращаем false в случае ошибки
        }
    }
}