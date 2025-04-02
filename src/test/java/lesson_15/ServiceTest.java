package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceTest extends BaseTest {

    @Test
    public void testMoreInfoLink() {
        driver.get("https://www.mts.by");
        ServicePage servicePage = new ServicePage(driver);

        // Получаем href ссылки "Подробнее о сервисе"
        String expectedHref = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"; // Замените на ожидаемый URL
        String actualHref = servicePage.getMoreInfoLinkHref();

        Assertions.assertEquals(expectedHref, actualHref, "Ссылка 'Подробнее о сервисе' не соответствует ожидаемой.");

        // Кликаем по ссылке "Подробнее о сервисе"
        servicePage.clickMoreInfoLink();

    }

}