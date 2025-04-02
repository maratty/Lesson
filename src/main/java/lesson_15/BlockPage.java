package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlockPage {
    private WebDriver driver;

    // Локатор для заголовка блока
    private By blockTitle = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2");

    // Конструктор
    public BlockPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для получения текста заголовка блока
    public String getBlockTitle() {
        WebElement titleElement = driver.findElement(blockTitle);
        return titleElement.getText();
    }
}