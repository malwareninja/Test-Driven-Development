/*
 * Author : Suraj S. Mundalik
 * Webste : http://suraj-mundalik.info
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class Lamp_Test {
	
	@Test
	public void testLampDimmer() {
		Lamp L = new Lamp();
		int exptectedDimmerLevel;
		int actualDimmerLevel;
		
		/*
		 * It will Pass
		 */
		exptectedDimmerLevel = 0;
		actualDimmerLevel = L.getDimmerLevel();
		assertEquals("Dimmer Level should be "+exptectedDimmerLevel, exptectedDimmerLevel, actualDimmerLevel);
		/*
		 * It will Fail as Lamp should be turned On first
		 */
		exptectedDimmerLevel = 1;
		L.setDimmerLevel();
		actualDimmerLevel = L.getDimmerLevel();
		assertEquals("Dimmer Level should be "+exptectedDimmerLevel, exptectedDimmerLevel, actualDimmerLevel);
		/*
		 * It will Pass as Lamp is turned On first
		 */
		L.setLampStatus("On");
		exptectedDimmerLevel = 1;
		L.setDimmerLevel();
		actualDimmerLevel = L.getDimmerLevel();
		assertEquals("Dimmer Level should be "+exptectedDimmerLevel, exptectedDimmerLevel, actualDimmerLevel);
		/*
		 * It will Pass as Lamp is already turned On in previous
		 */
		exptectedDimmerLevel = 3;
		L.setDimmerLevel();
		L.setDimmerLevel();
		actualDimmerLevel = L.getDimmerLevel();
		assertEquals("Dimmer Level should be "+exptectedDimmerLevel, exptectedDimmerLevel, actualDimmerLevel);
		
	}
	
	@Test
	public void testLampStatus() {
		Lamp L = new Lamp();
		String exptectedLampStatus;
		String actualLampStatus;
		
		exptectedLampStatus = "Off";
		actualLampStatus = L.getLampStatus();
		assertEquals("Lamp should be "+exptectedLampStatus, exptectedLampStatus, actualLampStatus);
		
		exptectedLampStatus = "On";
		L.setLampStatus("On");
		actualLampStatus = L.getLampStatus();
		assertEquals("Lamp should be "+exptectedLampStatus, exptectedLampStatus, actualLampStatus);
	}
}
