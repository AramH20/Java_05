import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testNumbersAreEqual() {
//        equa numbers

        int a = 89;
        int b = 89;

        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

    }

    @Test
    public void testFirstNumberSmaller() {
//       first smaller numbers

        int a = -89;
        int b = 89;

        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

    }

    @Test
    public void testFiestNumberBeeger() {
//        first bigger numbers

        int a = 89;
        int b = -89;

        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

    }

}
