package lesson_12_testng;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class BolsheTest {


    public void someTest() {

        System.out.println("Сравниваем два целых числа");

        int a = 5;
        int b = 7;

        if (a > b) {
            System.out.println("a больше b");
        } else if (a < b) {
            System.out.println("b больше a");
        } else {
            System.out.println("a и b равны");
        }
        Assert.assertEquals(b > a, true);


    }


}
