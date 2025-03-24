package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class CalculateTest {



    public  void calTest() {

        double x = 10;
        double y = 5;

        System.out.println(x + y);
        Assert.assertEquals(x + y, 15);

        System.out.println(x - y);
        Assert.assertEquals(x - y, 5);

        System.out.println(x * y);
        Assert.assertEquals(x * y, 50);

        System.out.println(x / y);
        Assert.assertEquals(x/y, 2);


    }
}