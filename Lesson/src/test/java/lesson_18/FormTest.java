package lesson_18;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FormTest extends BaseTest {
    private FormPage formPage;

    @Test
    public void testUslugiSvasi() {
        formPage = new FormPage(driver);
        formPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        // Выбираем элемент из выпадающего списка
        formPage.selectUslugiSvasi();

        // Проверяем текст полей
        String expectedLabel1 = "Номер телефона";
        String expectedLabel2 = "Сумма";
        String expectedLabel3 = "E-mail для отправки чека";

        assertEquals(expectedLabel1, formPage.getLabelText(formPage.labelField1), "Текст первого лейбла не совпадает");
        assertEquals(expectedLabel2, formPage.getLabelText(formPage.labelField2), "Текст второго лейбла не совпадает");
        assertEquals(expectedLabel3, formPage.getLabelText(formPage.labelField3), "Текст второго лейбла не совпадает");
    }

    @Test
    public void testDomInet() {
        formPage = new FormPage(driver);
        formPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        // Выбираем элемент из выпадающего списка
        formPage.selectDomInet();

        // Проверяем текст полей
        String expectedLabel4 = "Номер абонента";
        String expectedLabel5 = "Сумма";
        String expectedLabel6 = "E-mail для отправки чека";

        assertEquals(expectedLabel4, formPage.getLabelText(formPage.labelField4), "Текст первого лейбла не совпадает");
        assertEquals(expectedLabel5, formPage.getLabelText(formPage.labelField5), "Текст второго лейбла не совпадает");
        assertEquals(expectedLabel6, formPage.getLabelText(formPage.labelField6), "Текст второго лейбла не совпадает");
    }

    @Test
    public void testRassro4ka() {
        formPage = new FormPage(driver);
        formPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        // Выбираем элемент из выпадающего списка
        formPage.selectRassro4ka();

        // Проверяем текст полей
        String expectedLabel7 = "Номер счета на 44";
        String expectedLabel8 = "Сумма";
        String expectedLabel9 = "E-mail для отправки чека";

        assertEquals(expectedLabel7, formPage.getLabelText(formPage.labelField7), "Текст первого лейбла не совпадает");
        assertEquals(expectedLabel8, formPage.getLabelText(formPage.labelField8), "Текст второго лейбла не совпадает");
        assertEquals(expectedLabel9, formPage.getLabelText(formPage.labelField9), "Текст второго лейбла не совпадает");
    }

    @Test
    public void testZadolzenost() {
        formPage = new FormPage(driver);
        formPage.open();

        // Нажать кнопку принять куки
        WebElement acceptButton = driver.findElement(By.id("cookie-agree")); // Замените на реальный ID кнопки
        acceptButton.click();

        // Выбираем элемент из выпадающего списка
        formPage.selectZadolzenost();

        // Проверяем текст полей
        String expectedLabel10 = "Номер счета на 2073";
        String expectedLabel11 = "Сумма";
        String expectedLabel12 = "E-mail для отправки чека";

        assertEquals(expectedLabel10, formPage.getLabelText(formPage.labelField10), "Текст первого лейбла не совпадает");
        assertEquals(expectedLabel11, formPage.getLabelText(formPage.labelField11), "Текст второго лейбла не совпадает");
        assertEquals(expectedLabel12, formPage.getLabelText(formPage.labelField12), "Текст второго лейбла не совпадает");
    }
}