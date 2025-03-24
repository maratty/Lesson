package lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class TriangleTest {
    double a = 14;
    double b = 12;
    double c = 12;

    public void getAreaTest() {
        double p = (a + b + c) / 2;
        Assert.assertEquals((a + b + c) / 2, 19);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        Assert.assertEquals(Math.sqrt(p * (p - a) * (p - b) * (p - c)), 68.22756041366274);
        System.out.println(s);


    }
}














































