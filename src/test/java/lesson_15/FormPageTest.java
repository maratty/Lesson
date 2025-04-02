package lesson_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormPageTest extends BaseTest {

    private FormPage formPage;

    @Test
    public void testLabelsInEmptyFields() {
        driver.get("https://www.mts.by");

        formPage = new FormPage(driver);
        int fieldCount = formPage.getFieldCount();

        for (int i = 0; i < fieldCount; i++) {
            assertEquals(formPage.getExpectedLabel(i), formPage.getLabelText(i),
                    "Неверная надпись для поля: " + formPage.getExpectedLabel(i));
        }
    }
}