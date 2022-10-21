import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

//   1. Positiv testing Happu path
// if (start <= end)
//    return array

    @Test
    public void testStartLessThenEnd_HappyPath(){
// AAA
// arranget
      int start = 1;
      int end = 20;
      String[] expectedResult = {"1", "2","Fizz", "4", "Buzz", "Fizz", "7",
              "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
              "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
//      act
//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//     Assert
        Assert.assertEquals(actualResult, expectedResult);
//
    }
    //   1. Positiv testing Happu path
// if (start == end)
//    return array
    @Test
    public void testStartequalsToEnd_HappyPath(){
// AAA
// arranget
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};
//      act
//        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//     Assert
        Assert.assertEquals(actualResult, expectedResult);


// 2. Negative testing
//    if (start > end)
//    return new String[0];
}
//      @Ignore
//    @Test
//    public void testStartLessThenEnd_StartEndNegative_HappyPath(){
//// AAA
//// arranget
//        int start = 1;
//        int end = 20;
//        String[] expectedResult = {"1", "2","Fizz", "4", "Buzz", "Fizz", "7",
//                "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
//                "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
//
//        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
//
////     Assert
//        Assert.assertEquals(actualResult, expectedResult);
////
//    }
@Test
public void testStartGreatherThenEnd_HappyPath(){
// AAA
// arranget
    int start = 1;
    int end = -20;
    String[] expectedResult = {};
//      act
//        FizzBuzz fizzBuzz = new FizzBuzz();

    String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

//     Assert
    Assert.assertEquals(actualResult, expectedResult);
//
}


}
