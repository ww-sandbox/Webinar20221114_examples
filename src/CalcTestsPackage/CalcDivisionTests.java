package CalcTestsPackage;

import CalcApp.Calc;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalcDivisionTests {
    @BeforeClass
    public void setUpClass(){
        System.out.println("Uruchamamiam klasę testową");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Uruchamiam kolejna metode testowa");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Kończę metodę testową");
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = {"smoke", "full"})
    public void division_zero_division_is_invalid(){
        Calc calc = new Calc();

        calc.divide(2, 0);
    }

    @Test
    public void division_is_calcuated_properly(){
        Calc calc = new Calc();

        Assert.assertEquals(calc.divide(4,2), 2);
    }
}
