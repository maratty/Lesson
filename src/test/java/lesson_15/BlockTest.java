package lesson_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

    public class BlockTest extends BaseTest {

    //проверка блока
    @Test
    public void testBlockTitle() {

        driver.get("https://www.mts.by");

        BlockPage blockPage = new BlockPage(driver);

        String expectedTitle = "Онлайн пополнение\n" +
                "без комиссии";
        String actualTitle = blockPage.getBlockTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

}