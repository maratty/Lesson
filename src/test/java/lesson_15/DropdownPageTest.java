package lesson_15;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class DropdownPageTest extends BaseTest {

    private DropdownPage dropdownPage;

    @Test
    public void testClickDropdownAndSelectOption() throws InterruptedException {
        driver.get("https://www.mts.by");

        dropdownPage = new DropdownPage(driver);

        // Кликаем на выпадающий список
        dropdownPage.clickDropdown();

        // Даем время (например, 2 секунды) перед выбором элемента (можно использовать явное ожидание)
        Thread.sleep(2000); // Не рекомендуется использовать Thread.sleep в реальных тестах

        // Выбор элемента из выпадающего списка по XPath
        String xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[1]"; // Замените на ваш XPath для элемента
        dropdownPage.selectOptionByXPath(xpath);
    }

}