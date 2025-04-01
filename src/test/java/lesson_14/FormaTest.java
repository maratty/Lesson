package lesson_14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FormaTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testContinueButton() {
        // Открыть веб-страницу
        driver.get("https://www.mts.by");

        // Находим по селектору и вводим значения
        WebElement inputField1 = driver.findElement(By.cssSelector("#connection-phone"));
        WebElement inputField2 = driver.findElement(By.cssSelector("#connection-sum"));

        inputField1.sendKeys("297777777");
        inputField2.sendKeys("100");

        // Нажать кнопку "Продолжить"
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();
    }

    @AfterEach
    public void tearDown() {
        // Закрытие драйвера после завершения теста
        if (driver != null) {
            driver.quit();
        }
    }
}