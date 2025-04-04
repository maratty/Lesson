package lesson_14;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlockTest {

    @Test
    public void block() {
        // Инициализация веб-драйвера
        WebDriver driver = new ChromeDriver();

        // Открытие веб-страницы
        driver.get("https://www.mts.by");

        // Поиск элемента по ID
        WebElement element = driver.findElement(By.id("pay-section"));

        // Получение текста элемента
        String actualTitle = element.getText();

        // Ожидаемое значение
        String expectedTitle = "Онлайн пополнение без комиссии";

        // Проверка названия блока
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Название блока соответствует ожидаемому: " + actualTitle);
        } else {
            System.out.println("Название блока не соответствует. Ожидалось: " + expectedTitle + ", но получено: " + actualTitle);
        }
        // Закрытие браузера
        driver.quit();
    }


}





