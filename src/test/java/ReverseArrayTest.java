import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

//    1. Positive testing
//    return arrays revers
    @Test
    public void testArrayRevers(){
        int[] array = {4,3,7,12,5,2,9,4,12};

        int[] expectedResult = {12, 4, 9, 2, 5, 12, 7, 3, 4};

        int[] actualResult = new ReverseArray().reverseArray(array);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //    1. Positive testing
//    return arrays revers
    @Test
    public void testReversArray(){
        int[] array = {2, 7, 3, 10};

        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = new ReverseArray().reverseArray(array);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
