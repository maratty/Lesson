package lesson_15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver driver;

    // Локатор кликнуть, чтобы открылся список
    private By dropdown = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]");

    // Локаторы, чтобы выбрать наименование услуги
    private By dropdownOption1 = By.xpath("//*[@id=\"pay\"]/option[1]");
    private By dropdownOption2 = By.xpath("//*[@id=\"pay\"]/option[2]");
    private By dropdownOption3 = By.xpath("//*[@id=\"pay\"]/option[3]");
    private By dropdownOption4 = By.xpath("//*[@id=\"pay\"]/option[4]");

    // Локаторы для проверки полей:
    // Услуга связи
    By labelField1 = By.xpath("//*[@id=\"connection-phone\"]");
    By labelField2 = By.xpath("//*[@id=\"connection-sum\"]");
    By labelField3 = By.xpath("//*[@id=\"connection-email\"]");
    // Домашний интернет
    By labelField4 = By.xpath("//*[@id=\"internet-phone\"]");
    By labelField5 = By.xpath("//*[@id=\"internet-sum\"]");
    By labelField6 = By.xpath("//*[@id=\"internet-email\"]");
    //Рассрочка
    By labelField7 = By.xpath("//*[@id=\"score-instalment\"]");
    By labelField8 = By.xpath("//*[@id=\"instalment-sum\"]");
    By labelField9 = By.xpath("//*[@id=\"instalment-email\"]");
    //Задолженность
    By labelField10 = By.xpath("//*[@id=\"score-arrears\"]");
    By labelField11 = By.xpath("//*[@id=\"arrears-sum\"]");
    By labelField12 = By.xpath("//*[@id=\"arrears-email\"]");

    //Конструктор
    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод открыть страницу сайта
    public void open() {
        driver.get("https://www.mts.by");
    }

    // Метод для выбора Услуги связи из выпадающего списка
    public void selectUslugiSvasi() {
        // Кликаем на выпадающий список
        WebElement dropdownElement = driver.findElement(dropdown);
        dropdownElement.click();

        // Кликаем на нужный элемент в выпадающем списке
        WebElement optionElement = driver.findElement(dropdownOption1);
        optionElement.click();
    }

    // Метод для выбора Домашний интернет из выпадающего списка
    public void selectDomInet() {
        // Кликаем на выпадающий список
        WebElement dropdownElement = driver.findElement(dropdown);
        dropdownElement.click();

        // Кликаем на нужный элемент в выпадающем списке
        WebElement optionElement = driver.findElement(dropdownOption2);
        optionElement.click();
    }

    // Метод для выбора Рассрочка из выпадающего списка
    public void selectRassro4ka() {
        // Кликаем на выпадающий список
        WebElement dropdownElement = driver.findElement(dropdown);
        dropdownElement.click();

        // Кликаем на нужный элемент в выпадающем списке
        WebElement optionElement = driver.findElement(dropdownOption3);
        optionElement.click();
    }

    // Метод для выбора Задолженность из выпадающего списка
    public void selectZadolzenost() {
        // Кликаем на выпадающий список
        WebElement dropdownElement = driver.findElement(dropdown);
        dropdownElement.click();

        // Кликаем на нужный элемент в выпадающем списке
        WebElement optionElement = driver.findElement(dropdownOption4);
        optionElement.click();
    }

    // Метод для проверки полей (надписи)
    public String getLabelText(By label) {
        try {
            WebElement fieldElement = driver.findElement(label);
            return fieldElement.getAttribute("placeholder");
        } catch (NoSuchElementException e) {
            return null; // Лейбл не найден, возвращаем null
        }
    }
}