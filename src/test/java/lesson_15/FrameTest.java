package lesson_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FrameTest extends BaseTest {
    @Test
    public void testIframe() {
        FramePage framePage = new FramePage(driver);
        framePage.open();

        framePage.fillInputFields("297777777", "499");
        framePage.clickContinueButton();

        framePage.switchToFrame();

        // Текст для проверки
        String expectedlabelField1 = "Номер карты";
        String expectedlabelField2 = "Срок действия";
        String expectedlabelField3 = "CVC";
        String expectedlabelField4 = "Имя держателя (как на карте)";
        String expectedlabelField5 = "499.00 BYN";
        String expectedlabelField6 = "Оплатить 499.00 BYN";
        String expectedlabelField7 = "Оплата: Услуги связи Номер:375297777777";

        assertEquals(expectedlabelField1, framePage.getText1(framePage.labelField1), "Наименование поля не совпадает");
        assertEquals(expectedlabelField2, framePage.getText2(framePage.labelField2), "Наименование поля не совпадает");
        assertEquals(expectedlabelField3, framePage.getText3(framePage.labelField3), "Наименование поля не совпадает");
        assertEquals(expectedlabelField4, framePage.getText4(framePage.labelField4), "Наименование поля не совпадает");
        assertEquals(expectedlabelField5, framePage.getText5(framePage.labelField5), "Наименование поля не совпадает");
        assertEquals(expectedlabelField6, framePage.getText6(framePage.labelField6), "Наименование поля не совпадает");
        assertEquals(expectedlabelField7, framePage.getText7(framePage.labelField7), "Наименование поля не совпадает");

        //Проверка Иконок платежных систем
        assertTrue(framePage.visa(), "visa - отсутствует");
        assertTrue(framePage.mastercard(), "mastercard - отсутствует");
        assertTrue(framePage.belkart(), "belkart - отсутствует");
        assertTrue(framePage.maestro(), "maestro - отсутствует");
        assertTrue(framePage.mir(), "mir - отсутствует");


    }

}
