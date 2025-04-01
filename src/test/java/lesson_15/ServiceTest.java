package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        // Перейдите на страницу с ссылкой "Подробнее о сервисе"
        driver.get("https://www.mts.by");
    }

    @Test
    public void testMoreInfoLink() {
        ServicePage servicePage = new ServicePage(driver);

        // Получаем href ссылки "Подробнее о сервисе"
        String expectedHref = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"; // Замените на ожидаемый URL
        String actualHref = servicePage.getMoreInfoLinkHref();

        Assertions.assertEquals(expectedHref, actualHref, "Ссылка 'Подробнее о сервисе' не соответствует ожидаемой.");

        // Кликаем по ссылке "Подробнее о сервисе"
        servicePage.clickMoreInfoLink();

    }
    // Закрыть браузер после тестов
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}