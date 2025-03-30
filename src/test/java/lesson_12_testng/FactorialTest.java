package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import programms.Factorial;


@Test
public class FactorialTest {
    Factorial factorial = new Factorial();

    public void testFactorialRecursive() {

        Assert.assertEquals(Factorial.factorialRecursive(0), 1);
        Assert.assertEquals(Factorial.factorialRecursive(1), 1);
        Assert.assertEquals(Factorial.factorialRecursive(2), 2);
        Assert.assertEquals(Factorial.factorialRecursive(3), 6);
        Assert.assertEquals(Factorial.factorialRecursive(4), 24);
        Assert.assertEquals(Factorial.factorialRecursive(5), 120);
    }

}
