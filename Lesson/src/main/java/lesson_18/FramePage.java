package lesson_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FramePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Локаторы для кнопки продолжить
    private By inputField1 = By.xpath("//*[@id=\"connection-phone\"]");
    private By inputField2 = By.xpath("//*[@id=\"connection-sum\"]");
    private By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");

    // Локаторы для проверки текста
    By labelField1 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label");
    By labelField2 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label");
    By labelField3 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label");
    By labelField4 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label");
    By labelField5 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span");
    By labelField6 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button");
    By labelField7 = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");

    // Локаторы для иконок платежных систем
    private By visa = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]");
    private By mastercard = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]");
    private By belkart = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]");
    private By maestro = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[1]");
    private By mir = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]");

    // Конструктор
    public FramePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //метод открытия страницы сайта
    public void open() {
        driver.get("https://www.mts.by");
    }

    public void switchToFrame() {
        // Ожидаем появления фрейма и переключаемся на него
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[8]/div/iframe")));
    }

    // Метод для заполнения пустых полей
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

    // Получаем текст поля "Номер карты"
    public String getText1(By labelField1) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField1));
        return field.getText();
    }

    // Получаем текст поля "Срок действия"
    public String getText2(By labelField2) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField2));
        return field.getText();
    }

    // Получаем текст поля "CVC"
    public String getText3(By labelField3) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField3));
        return field.getText();
    }

    // Получаем текст поля "Имя держателя (как на карте)"
    public String getText4(By labelField4) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField4));
        return field.getText();
    }

    // Получаем текст суммы BYN
    public String getText5(By labelField5) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField5));
        return field.getText();
    }

    // Получаем текст суммы BYN на кнопке
    public String getText6(By labelField6) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField6));
        return field.getText();
    }

    // Получаем текст номера телефона
    public String getText7(By labelField7) {
        WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(labelField7));
        return field.getText();
    }

    // Методы проверки иконок платежных систем
    public boolean visa() {
        try {
            WebElement logo = driver.findElement(visa);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }

    public boolean mastercard() {
        try {
            WebElement logo = driver.findElement(mastercard);
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

    public boolean maestro() {
        try {
            WebElement logo = driver.findElement(maestro);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true; // Логотип не найден
        }
    }

    public boolean mir() {
        try {
            WebElement logo = driver.findElement(mir);
            return logo.isDisplayed(); // Проверяем, отображается ли логотип
        } catch (Exception e) {
            return true;
        }
    }
}


