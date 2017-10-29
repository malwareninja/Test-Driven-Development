/*
 *Author : Suraj S. Mundalik
 *Website : http://suraj-mundalik.info
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class PointTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("We are ready to begin!");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("We are done with everything!");
	}

	@Test
	public void testMidPoint() {
		Point P1 = new Point(3, 5);
		Point P2 = new Point(9, 3);
		Point P3 = P1.differsPoint(P2);
		int expectedX = Math.abs(3 - 9);
		int actualX = P3.getX();
		assertEquals("Expected X is wrong.", expectedX, actualX);
		int expectedY = Math.abs(5 - 3);
		int actualY = P3.getY();
		assertEquals("Expected Y is wrong.", expectedY, actualY);
	}

}
