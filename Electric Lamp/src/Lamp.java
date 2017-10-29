
public class Lamp {
	
	private String lamp_status;
	private int dimmer;
	
	public Lamp() {
		this.lamp_status = "Off";
		this.dimmer = 0;
	}
	
	public int setLampStatus(String status) {
		this.lamp_status = status;
		if(this.lamp_status.equals("On")) {
			/*
			 * If Lamp is On dimmer will vary in 3 levels
			 */			
			System.out.println("*** Lamp is turned On ***");
			for(int i = 1; i <= 3; i++) {
				System.out.println("Dimmer is at Level "+i);
				this.dimmer++;
			}
		}
		else {
			System.out.println("*** Lamp is turned Off ***");
			/*
			 * If Lamp is Off dimmer is not operational
			 */
			this.dimmer = 0;
		}
		return this.dimmer;
	}
}
