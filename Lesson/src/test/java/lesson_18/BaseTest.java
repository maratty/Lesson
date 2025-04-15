package lesson_18;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после теста
        if (driver != null) {
            driver.quit();
        }
    }
}