package CalcTestsPackage;

import CalcApp.Calc;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcSumTests {
    @DataProvider(name = "sum_data_provider")
    public Object[][] providerMethod(){
        return new Object[][] {{2,3,5}, {1,2,3}, {10,-3,7}};
    }

    @Test(dataProvider = "sum_data_provider", groups = {"smoke"})
    public void simpleSumTest(int a, int b, int exp){
        Calc calc = new Calc();
        int res = calc.sum(a,b);

        Assert.assertEquals(res, exp);
    }


}
