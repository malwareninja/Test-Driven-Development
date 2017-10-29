
public class Lamp {
	
	private String lamp_status;
	private int dimmer;
	
	public Lamp() {
		this.lamp_status = "Off";
		this.dimmer = 0;
	}
	
	public void setLampStatus(String status) {
		this.lamp_status = status;
		if(this.lamp_status.equals("On")) {
			System.out.println("*** Lamp is turned On ***");
		}
		else {
			System.out.println("*** Lamp is turned Off ***");
			this.dimmer = 0;
		}
	}
	
	public String getLampStatus() {
		return this.lamp_status;
	}
	
	public void setDimmerLevel() {
		if(this.lamp_status.equals("On")) {
			if(this.dimmer != 3) {
				this.dimmer++;
			}
		}
		else {
			System.out.println("Lamp must be On");
		}
	}
	
	public int getDimmerLevel() {
		return this.dimmer;
	}
}
