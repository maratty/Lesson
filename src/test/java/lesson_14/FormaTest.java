package lesson_14;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormaTest {

    @Test
    public void form() {
        // Создаем экземпляр драйвера
        WebDriver driver = new ChromeDriver();

        // Открываем нужный URL
        driver.get("https://www.mts.by");

        // Создаем экземпляр WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Находим элемент селекта
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pay-section")));   // Создаем объект Select
        Select select = new Select(selectElement);
        // Выбор по видимому тексту
        select.selectByVisibleText("Услуги связи");

        //Заполняем поля
        WebElement numberField = driver.findElement(By.id("Номер телефона"));
        numberField.sendKeys("297777777");

        WebElement summaField = driver.findElement(By.id("Сумма"));
        summaField.sendKeys("100");

        WebElement emailField = driver.findElement(By.id("E-mail для отправки чека "));
        emailField.sendKeys("marraty@mail.ru");

        // Ожидаем, пока кнопка "Продолжить" не станет кликабельной
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("Продолжить")));

        // Нажимаем на кнопку "Продолжить"
        continueButton.click();




        driver.quit();
    }
}

