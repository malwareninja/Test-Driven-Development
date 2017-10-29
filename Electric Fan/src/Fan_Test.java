/*
 * Author : Suraj S. Mundalik
 * Webste : http://suraj-mundalik.info
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class Fan_Test {

	@Test
	public void testFanRegulator() {
		Fan F = new Fan();
		int exptectedFanSpeed;
		int actualFanSpeed;
		
		/*
		 * It will Pass
		 */
		exptectedFanSpeed = 0;
		actualFanSpeed = F.getFanSpeed();
		assertEquals("Fan Speed should be "+exptectedFanSpeed, exptectedFanSpeed, actualFanSpeed);
		/*
		 * It will Fail as Fan should be turned On first
		 */
		exptectedFanSpeed = 1;
		F.rotateRegulator();
		actualFanSpeed = F.getFanSpeed();
		assertEquals("Fan Speed should be "+exptectedFanSpeed, exptectedFanSpeed, actualFanSpeed);
		/*
		 * It will Pass as Fan is turned On first
		 */
		F.setFanStatus("On");
		exptectedFanSpeed = 1;
		F.rotateRegulator();
		actualFanSpeed = F.getFanSpeed();
		assertEquals("Fan Speed should be "+exptectedFanSpeed, exptectedFanSpeed, actualFanSpeed);
		/*
		 * It will Pass as Fan is already turned On in previous
		 */
		exptectedFanSpeed = 3;
		F.rotateRegulator();
		F.rotateRegulator();
		actualFanSpeed = F.getFanSpeed();
		assertEquals("Fan Speed should be "+exptectedFanSpeed, exptectedFanSpeed, actualFanSpeed);
		
	}
	
	@Test
	public void testFanStatus() {
		Fan F = new Fan();
		String exptectedFanStatus;
		String actualFanStatus;
		
		exptectedFanStatus = "Off";
		actualFanStatus = F.getFanStatus();
		assertEquals("Fan should be "+exptectedFanStatus, exptectedFanStatus, actualFanStatus);
		
		exptectedFanStatus = "On";
		F.setFanStatus("On");
		actualFanStatus = F.getFanStatus();
		assertEquals("Lamp should be "+exptectedFanStatus, exptectedFanStatus, actualFanStatus);
	}

}
