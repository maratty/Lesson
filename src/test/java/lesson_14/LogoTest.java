package lesson_14;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class LogoTest {

    @Test
    public void logo() {
        // Создаем экземпляр драйвера
        WebDriver driver = new ChromeDriver();

                try {
                    // Открываем нужный URL
                    driver.get("https://www.mts.by");

                    // Находим блок, в котором нужно проверить наличие логотипов
                    WebElement logoBlock = driver.findElement(By.id("pay-section")); // Замените на ваш селектор

                    // Находим все элементы изображений внутри указанного блока
                    List<WebElement> logos = logoBlock.findElements(By.tagName("img"));

                    // Перебираем найденные элементы и проверяем наличие логотипов
                    boolean logoFound = false;
                    for (WebElement logo : logos) {
                        String src = logo.getAttribute("src");
                        // добавляем условия для проверки, является ли изображение логотипом
                        if (src.contains("logo") || src.contains("Логотип")) {
                            System.out.println("Логотип найден: " + src);
                            logoFound = true;
                        }
                    }

                    if (!logoFound) {
                        System.out.println("Логотипы не найдены в указанном блоке.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Закрываем драйвер
                    driver.quit();
                }
            }
        }

