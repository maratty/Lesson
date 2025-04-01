package lesson_14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

    class LogoTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

    }

    @Test
    public void Logo() {

        driver.get("https://www.mts.by");

        // Список логотипов платёжных систем
        String[] logos = {
                "img[alt='Visa']",
                "img[alt='MasterCard']",
                "img[alt='Verified By Visa']",
                "img[alt='MasterCard Secure Code']",
                "img[alt='Белкарт']",
        };

        for (String logo : logos) {
            List<WebElement> elements = driver.findElements(By.cssSelector(logo));

        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}