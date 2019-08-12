package software;

public class PixelColor extends PixelBW{

	private int color = -1; //off ==-1
	public PixelColor(boolean on, int color) {
		super(on);
		this.color = color;
		checkOnAndColor();
		// TODO Auto-generated constructor stub
	}

	public void changeColor(int newColor) {
		checkOnAndColor();
		if(newColor == -1)
			turnOff();
		if(newColor!=-1 && color==-1) 
			turnOn();
		color = newColor;
		
	}
	
	@Override
	public void turnOff() {
		changeColor(-1);
	}
	
	//if it's off color is 0 and if it's on it has to be different
	public boolean checkOnAndColor() {
		if(color==-1 && on==false || color!=-1 && on==true)
			return true;
		else throw new IllegalStateException("Color and State are Wrong!(eg it's turned on but color is -1(off))");
		
	}

	public int getColor() {
		return color;
	}
}
