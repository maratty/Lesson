package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import programms.Factorial;

@Test
public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void testFactorialRecursive() {
        Assert.assertEquals(factorial.calculate(0), 1);
        Assert.assertEquals(factorial.calculate(1), 1);
        Assert.assertEquals(factorial.calculate(2), 2);
        Assert.assertEquals(factorial.calculate(3), 6);
        Assert.assertEquals(factorial.calculate(4), 24);
        Assert.assertEquals(factorial.calculate(5), 120);
    }
}
