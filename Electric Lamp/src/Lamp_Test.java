/*
 * Author : Suraj S. Mundalik
 * Webste : http://suraj-mundalik.info
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class Lamp_Test {
	
	@Test
	public void testLampOff() {
		Lamp L = new Lamp();
		int exptectedDimmerLevel = 0;
		int actualDimmerLevel = L.setLampStatus("Off");
		assertEquals("Dimmer should not be operational when the Lamp is Off.", exptectedDimmerLevel, actualDimmerLevel);		
	}
	
	@Test
	public void testLampOn() {
		Lamp L = new Lamp();
		int exptectedDimmerLevel = 3;
		int actualDimmerLevel = L.setLampStatus("On");
		assertEquals("Dimmer Level should be "+exptectedDimmerLevel+" when the Lamp is On.", exptectedDimmerLevel, actualDimmerLevel);		
	}
}
