import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

//    1. Positiv testing
//    return arrays intersection
    @Test
    public void testTwoArraysHasIntersection(){
        int[] array1 = {1,2,4,5,89};
        int[] array2 = {8,9,4,2};

        int[] expectedResult = {2, 4};

        int[] actualResult = new Intersection().intersection(array1, array2);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //    1. Positiv testing
//    return arrays intersection
    @Test
    public void testTwoArraysIntersection(){
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};

        int[] expectedResult = {8, 9};

        int[] actualResult = new Intersection().intersection(array1, array2);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    //    1. Positiv testing
//    return arrays intersection
    @Test
    public void testTwoArraysHasNoIntersection(){
        int[] array1 = {1, 2, 4, 5, 89};

        int[] array2 = {8, 9, 45};

        int[] expectedResult = {};

        int[] actualResult = new Intersection().intersection(array1, array2);

        //     Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
