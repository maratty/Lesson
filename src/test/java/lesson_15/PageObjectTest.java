package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PageObjectTest {
    private WebDriver driver;
    private PageObject page;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        page = new PageObject(driver);
    }

    @Test
    public void testFillFieldsAndContinue() {
        page.fillInputFields("Test Input 1", "Test Input 2");
        page.clickContinueButton();

        // проверка
        Assertions.assertTrue(page.isButtonWorking(), "Кнопка 'Продолжить' не работает.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
