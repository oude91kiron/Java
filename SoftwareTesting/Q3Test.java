/*---------------------------------------------------------------------------
This is a Junit testing class testing the method countVCDS in Q3 so to run  -
this test unit you need to use eclipse and you have to add Junit framwork   -
---------------------------------------------------------------------------*/

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class Q3Test {
        @Test
        public void testVowels()
        {
                int exp[]= {5,21,2,3};
                assertTrue(Arrays.equals(exp, Q3.countVCDS("1abcde fghijkl mnopqr stuvwxyz9")));
        }
}