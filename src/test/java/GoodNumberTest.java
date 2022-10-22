import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodNumberTest {

@Test
public void testIsTheNumberGood(){
//    good number
    int a = 63;
    String expectedResult = "Good Number";

    String actualResult = new GoodNumber().goodNumber(a);

    //     Assert
    Assert.assertEquals(actualResult, expectedResult);
}
    @Test
    public void testIsTheBedNumber(){
//    good number
        int a = 18;
        String expectedResult = "Bad Number";

        String actualResult = new GoodNumber().goodNumber(a);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsThePoorNumber(){
//    good number
        int a = 22;
        String expectedResult = "Poor Number";

        String actualResult = new GoodNumber().goodNumber(a);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRandomNumber(){
//    ramdom number
        int a = 17;
        String expectedResult = "-1";

        String actualResult = new GoodNumber().goodNumber(a);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
