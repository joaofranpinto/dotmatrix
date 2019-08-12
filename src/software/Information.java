package software;

public class Information {

	private Panel panel;
	
	public Information(Panel panel) {
		super();
		this.panel = panel;
	}

	public double spacingBetweenPixels() {
		return SpacingBetweenPixels.spacingBetweenPixels(panel.getModel());
	}


	public DotMatrix getFullMatrix() {
		
		
		return null;
		
	}
}
