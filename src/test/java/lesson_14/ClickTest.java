package lesson_14;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClickTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testService() {
        // Открываем страницу
        driver.get("https://www.mts.by");

        // Находим ссылку «Подробнее о сервисе»
        WebElement service = driver.findElement(By.linkText("Подробнее о сервисе"));

        // Проверяем, что ссылка отображается
        assertTrue(service.isDisplayed(), "Ссылка 'Подробнее о сервисе' не отображается.");

        // Получаем URL ссылки
        String linkUrl = service.getAttribute("href");

        // Кликаем на ссылку
        service.click();

        // Проверяем, что мы попали на ожидаемую страницу
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "URL не совпадает с ожидаемым.");

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
