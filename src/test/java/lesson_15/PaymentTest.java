package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PaymentTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        // Перейдите на страницу с логотипами платёжных систем
        driver.get("https://www.mts.by");
    }

    @Test
    public void testPaymentLogosPresence() {
        PaymentPage paymentPage = new PaymentPage(driver);

        List<WebElement> logos = paymentPage.getPaymentLogos();

        // Проверяем, что логотипы присутствуют на странице
        Assertions.assertFalse(logos.isEmpty(), "Логотипы платёжных систем не найдены на странице.");

        // проверяем наличие конкретных логотипов по их тексту
        Assertions.assertTrue(logos.stream().anyMatch(logo -> logo.getAttribute("alt").equals("Visa")), "Логотип Visa не найден.");
        Assertions.assertTrue(logos.stream().anyMatch(logo -> logo.getAttribute("alt").equals("MasterCard")), "Логотип MasterCard не найден.");
        Assertions.assertTrue(logos.stream().anyMatch(logo -> logo.getAttribute("alt").equals("Verified By Visa")), "Логотип Verified By Visa не найден.");
        Assertions.assertTrue(logos.stream().anyMatch(logo -> logo.getAttribute("alt").equals("MasterCard Secure Code")), "Логотип MasterCard не найден.");
        Assertions.assertTrue(logos.stream().anyMatch(logo -> logo.getAttribute("alt").equals("Белкарт")), "Логотип Белкарт не найден.");
    }

    @AfterEach
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}