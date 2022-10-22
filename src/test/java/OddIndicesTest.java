import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {



@Test
public void testArrayHesOneElement(){
    int[] a = {-45,590,234,985,12,68};
    int[] expectedResult = {-45,590,234,985,12,68};

    int [] actualResult = OddIndices.oddIndices(a);

    Assert.assertEquals(actualResult, expectedResult);
}

    @Test
    public void testArrayHesElements(){
        int[] a = {1};
        int[] expectedResult = null;

        int [] actualResult = OddIndices.oddIndices(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
//    int[] a = {0,1,2,3,4,5,6,7};
//    int[] b = {-45,590,234,985,12,68};
//
//    int[] expectedResult =  {590, 985, 68};

//	    for(int i = 0; i < OddIndices(b).length; i++){
//        System.out.println(OddIndices(b)[i]);
//    }
//		System.out.println(OddIndices(b));
}
