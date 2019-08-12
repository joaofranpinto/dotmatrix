package trains;

public class Train {
	
	private int length;
	private Carriage[] carriages;
	public Train(int length, Carriage[] carriages) {
		this.length = length;
		this.carriages = carriages;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Carriage[] getCarriages() {
		return carriages;
	}
	public void setCarriages(Carriage[] carriages) {
		this.carriages = carriages;
	}
	
	

}
