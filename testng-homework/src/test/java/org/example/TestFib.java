package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFib {
    private Logger log = LogManager.getLogger();
    private FibCalc fibCalc;

    @DataProvider(parallel = true)


    public static Object[][] data() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {10, 55},
                {50, 12586269025L},
                {-3, 2},
                {-10, -55},
        };
    }



    @Test(dataProvider = "data", timeOut = 130)
    public void testFib(long n, long exp) {
        long calc = fibCalc.calc(n);
        log.info("Получено число {}", calc);
        Assert.assertEquals(calc, exp, "Неправильный ответ");
    }

    @BeforeClass
    public void setUp() {
        fibCalc = new FibCalc();
    }

//    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "negative")
//    public void expectExceptionWhenNegative(long n) {
//        fibCalc.calc(n);
//    }
}
