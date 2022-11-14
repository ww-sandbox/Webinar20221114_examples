package CalcTestsPackage;

import CalcApp.Calc;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcMultiplyTests {
    @Test
    public void multiply_simple_numbers_is_valid(){
        Calc calc = new Calc();

        int result = calc.multiply(3,2);
        Assert.assertEquals(result, 6);
    }
}
