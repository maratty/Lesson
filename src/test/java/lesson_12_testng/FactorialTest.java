package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FactorialTest {

    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public void facTest() {
        System.out.println(calculateFactorial(4));
        Assert.assertEquals(calculateFactorial(4), 24);
    }
}