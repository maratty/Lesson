package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicePage {
    private WebDriver driver;

    // Локатор для ссылки "Подробнее о сервисе"
    private By moreInfoLink = By.linkText("Подробнее о сервисе");

    // Конструктор
    public ServicePage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для получения href ссылки "Подробнее о сервисе"
    public String getMoreInfoLinkHref() {
        WebElement linkElement = driver.findElement(moreInfoLink);
        return linkElement.getAttribute("href");
    }

    // Метод для клика по ссылке "Подробнее о сервисе"
    public void clickMoreInfoLink() {
        WebElement linkElement = driver.findElement(moreInfoLink);
        linkElement.click();
    }


}