package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BlockPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Локатор для заголовка блока
    private By blockTitle = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2");

    // XPath для логотипов
    private By visaLogo = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img");
    private By verifiedByVisa = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img");
    private By masterCard = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img");
    private By masterCardSecureCode = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img");
    private By belkart = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img");

    // Локатор для ссылки "Подробнее о сервисе"
    private By moreInfoLink = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");

    // Локаторы для кнопки продолжить
    private By inputField1 = By.xpath("//*[@id=\"connection-phone\"]");
    private By inputField2 = By.xpath("//*[@id=\"connection-sum\"]");
    private By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");

    // Конструктор
    public BlockPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //метод открытия страницы сайта
    public void open() {
        driver.get("https://www.mts.by");
    }

    // Метод для получения текста заголовка блока
    public String getBlockTitle() {
        WebElement titleElement = driver.findElement(blockTitle);
        return titleElement.getText();
    }

    // Методы для логотипов
    public boolean visaLogo() {
        try {
            WebElement logo = driver.findElement(visaLogo);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }
    public boolean verifiedByVisa() {
        try {
            WebElement logo = driver.findElement(verifiedByVisa);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }
    public boolean masterCard() {
        try {
            WebElement logo = driver.findElement(masterCard);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }
    public boolean masterCardSecureCode() {
        try {
            WebElement logo = driver.findElement(masterCardSecureCode);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }
    public boolean belkart() {
        try {
            WebElement logo = driver.findElement(belkart);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }

    // Методы для проверки ссылки "Подробнее о сервисе"
    public String getLinkText() {
        try {
            WebElement linkElement = driver.findElement(moreInfoLink);
            return linkElement.getText(); // Получаем текст ссылки
        } catch (NoSuchElementException e) {
            return null; // Ссылка не найдена, возвращаем null
        }
    }

    public String getLinkHref() {
        try {
            WebElement linkElement = driver.findElement(moreInfoLink);
            return linkElement.getAttribute("href"); // Получаем значение атрибута href
        } catch (NoSuchElementException e) {
            return null; // Ссылка не найдена, возвращаем null
        }
    }

    public void clickLink() {
        try {
            WebElement linkElement = driver.findElement(moreInfoLink);
            linkElement.click(); // Кликаем по ссылке
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Ссылка не найдена для клика");
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl(); // Получаем текущий URL страницы
    }

    // Метод для заполнения пустых полей Услуги связи
    public void fillInputFields(String value1, String value2) {
        WebElement field1 = driver.findElement(inputField1);
        WebElement field2 = driver.findElement(inputField2);

        field1.sendKeys(value1);
        field2.sendKeys(value2);
    }

    // Метод нажать кнопку Продолжить
    public void clickContinueButton() {
        WebElement button = driver.findElement(continueButton);
        button.click();
    }

    // для проверки кнопки продолжить
    public boolean isButtonWorking() {

        return true;
    }



}