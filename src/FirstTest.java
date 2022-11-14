import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    int expectedResult = 6;

    @Test(priority = 2)
    public void sumTest(){
        int result = 2 + 3;

        Assert.assertEquals(result, expectedResult, "Improper result of sum");
    }

//    @Test(dependsOnMethods = {"sumTest"})
    @Test(priority = 1, dependsOnMethods = {"sumTest"})
    public void multiplyTest(){
        int result = 2 * 3;

        Assert.assertEquals(result, expectedResult);
    }
}
