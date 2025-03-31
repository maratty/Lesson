package lesson_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;

import static com.ibm.cuda.CudaError.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClickTest {

    @Test
    public void click() {
        // Создаем экземпляр драйвера
        WebDriver driver = new ChromeDriver();

        try {
            // Открываем нужный URL
            driver.get("https://www.mts.by");

            // Находим элемент ссылки
            WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));

            // Получаем URL ссылки
            String url = link.getAttribute("href");
            System.out.println("Проверяем ссылку: " + url);

            // Проверяем, что ссылка работает
            if (isLinkWorking(url)) {
                System.out.println("Ссылка работает: " + url);
            } else {
                System.out.println("Ссылка не работает: " + url);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Закрываем драйвер
            driver.quit();
        }
    }
    @Test
    // Метод для проверки работы ссылки
    public static boolean isLinkWorking(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            return (responseCode >= 200 && responseCode < 400); // Успешный код ответа
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}

