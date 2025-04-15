package lesson_15;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlockTest extends BaseTest {


    //1. Проверить название указанного блока;
    @Test
    public void testBlockTitle() {

        BlockPage blockPage = new BlockPage(driver);
        blockPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();


        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        String actualTitle = blockPage.getBlockTitle();

        assertEquals(expectedTitle, actualTitle);

    }

    //2. Проверить наличие логотипов платёжных систем;
    @Test
    public void testLogo() {
        BlockPage blockPage = new BlockPage(driver);
        blockPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        assertTrue(blockPage.visaLogo(), "Visa");
        assertTrue(blockPage.verifiedByVisa(), "Verified By Visa");
        assertTrue(blockPage.masterCard(), "MasterCard");
        assertTrue(blockPage.masterCardSecureCode(), "MasterCard Secure Code");
        assertTrue(blockPage.belkart(), "Белкарт");
    }

    //3. Проверить работу ссылки «Подробнее о сервисе»;
    @Test
    public void testServiceLink() {
        BlockPage blockPage = new BlockPage(driver);
        blockPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        String expectedLinkText = "Подробнее о сервисе";
        String expectedHref = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        assertEquals(expectedLinkText, blockPage.getLinkText(), "Текст ссылки не совпадает");

        blockPage.clickLink(); // Кликаем по ссылке

        assertEquals(expectedHref, blockPage.getCurrentUrl(), "URL после клика не совпадает");
    }

    //4. Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)
    @Test
    public void testContinueButton() {
        BlockPage blockPage = new BlockPage(driver);
        blockPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        blockPage.fillInputFields("297777777", "100");
        blockPage.clickContinueButton();

        Assertions.assertTrue(blockPage.isButtonWorking(), "Кнопка 'Продолжить' не работает.");
    }
}