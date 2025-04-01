package lesson_15;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlockTest {
    //инициализируется WebDriver и открывается страница с блоком.
    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        // Перейдите на страницу
        driver.get("https://www.mts.by");
    }

    //проверка блока
    @Test
    public void testBlockTitle() {

        BlockPage blockPage = new BlockPage(driver);

        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        String actualTitle = blockPage.getBlockTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    //закрытие браузера
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}