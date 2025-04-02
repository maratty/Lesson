package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropdownPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Локатор для выпадающего списка
    private By dropdownLocator = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]"); // Замените на реальный ID вашего выпадающего списка

    // Локатор для элемента в выпадающем списке
    private By optionLocator(String optionText) {
        return By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[1]" + optionText + "']"); // Замените на подходящий локатор для вашего элемента
    }

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Установите время ожидания
    }

    // Метод для клика на выпадающий список
    public void clickDropdown() {
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownLocator));
        dropdown.click();
    }

    // Метод для выбора элемента из выпадающего списка по XPath
    public void selectOptionByXPath(String xpath) {
        // Ожидание появления элемента в списке
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        option.click();
    }
}