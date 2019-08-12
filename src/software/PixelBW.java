package software;

public class PixelBW {
	
	public boolean on = false;

	public PixelBW(boolean on) {
		this.on = on;
	}
	
	public void test_on_off() {
		for(int i=0;i<100;i++) {
			on = !on;
			i++;
		}
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	
}
