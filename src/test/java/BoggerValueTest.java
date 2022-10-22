import org.testng.Assert;
import org.testng.annotations.Test;

public class BoggerValueTest {

    @Test
    public void testValueOfNumbers(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        int actualResult = BoggerValue.boggerValue(a, b);

        Assert.assertEquals(actualResult, expectedResult);

    }
}

