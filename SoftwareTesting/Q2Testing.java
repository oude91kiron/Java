/*---------------------------------------------------------------
This is a Junit testing class testing the method concat in Q2   -
so to run this test unit use eclipse and add Junit framwork     -
---------------------------------------------------------------*/

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Q2Test {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testConcat() {
		int a[]= {1,2,3};
        int b[]= {4,5,6,-7};
        int expected[]= {1,2,3,4,5,6,-7};
        //checking if it is returning the array as expected
        assertTrue(Arrays.equals(Q2.concat(a, b), expected));
	}

}