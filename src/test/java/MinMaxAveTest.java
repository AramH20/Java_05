import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

//   1. Positiv testing Happu path
// if (ind1 < ind2)
//    return array
   @Test
    public void testRightRangeIndexes(){
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
       int ind1 = 2;
       int ind2 = 6;
       int[] expectedResult = {3,7,5};

       int[] actualResult = new MinMaxAve().minMaxAve(array, ind1, ind2);

       //     Assert
       Assert.assertEquals(actualResult, expectedResult);

   }

 //   2. Positiv testing Happu path
//    if (ind1 > ind2)
//    return array
   @Test
   public void testReversIndexes(){
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
      int ind1 = 6;
      int ind2 = 2;
      int[] expectedResult = {3,7,5};

      int[] actualResult = new MinMaxAve().minMaxAve(array, ind1, ind2);

      //     Assert
      Assert.assertEquals(actualResult, expectedResult);

   }


//   3. Negative testing Happu path
//   if (ind1 or ind2 > array.length)
//   return array
   @Test
   public void testRightWrongIndexes(){
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
      int ind1 = 2;
      int ind2 = 16;
      int[] expectedResult = null;

      int[] actualResult = new MinMaxAve().minMaxAve(array, ind1, ind2);

      //     Assert
      Assert.assertEquals(actualResult, expectedResult);

   }
}
