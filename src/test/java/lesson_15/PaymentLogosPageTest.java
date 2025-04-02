package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentLogosPageTest extends BaseTest {

    private PaymentLogosPage paymentLogosPage;

    @Test
    public void testPaymentLogosPresence() {
        driver.get("https://www.mts.by");

        paymentLogosPage = new PaymentLogosPage(driver);
        // Проверяем наличие логотипов платежных систем на странице
        boolean logosPresent = paymentLogosPage.arePaymentLogosPresent();
        
        // Убедитесь, что хотя бы один логотип присутствует на странице
        assertTrue(logosPresent, "Логотипы платежных систем не найдены на странице.");
    }
}