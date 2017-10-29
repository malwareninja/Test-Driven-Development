
public class Fan {
	
	private String fan_status;
	private int fan_speed;
	
	public Fan() {
		this.fan_status = "Off";
		this.fan_speed = 0;
	}
	
	public void setFanStatus(String status) {
		this.fan_status = status;
		if(this.fan_status.equals("On")) {
			System.out.println("*** Fan is turned On ***");
		}
		else {
			System.out.println("*** Fan is turned Off ***");
			this.fan_speed = 0;
		}
	}
	
	public String getFanStatus() {
		return this.fan_status;
	}
	
	public void rotateRegulator() {
		if(this.fan_status.equals("On")) {
			if(this.fan_speed != 5) {
				this.fan_speed++;
			}
		}
		else {
			System.out.println("Fan must be On");
		}
	}
	
	public int getFanSpeed() {
		return this.fan_speed;
	}
}