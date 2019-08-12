package software;

public class DotMatrix {

	private PixelBW[][] matrix;
	private int numberOfMatrix;
	boolean on = false;
	public double spacingBetweenPixels;

	public DotMatrix(PixelBW[][] matrix, int numberOfMatrix,double spacingBetweenPixels) {
		this.matrix = matrix;
		this.numberOfMatrix = numberOfMatrix;
		this.spacingBetweenPixels = spacingBetweenPixels;
	}

	public double getSpacingBetweenPixels() {
		return spacingBetweenPixels;
	}

	public PixelBW[][] getMatrix() {
		return matrix;
	}

	public void setOnePosition(PixelBW pixel,int x,int y) {
		this.matrix[x][y] = pixel;
	}
	public void setMatrix(PixelBW[][] matrix) {
		this.matrix = matrix;
	}

	public int getNumberOfMatrix() {
		return numberOfMatrix;
	}

	public void setNumberOfMatrix(int numberOfMatrix) {
		this.numberOfMatrix = numberOfMatrix;
	}

	public boolean isOn() {
		return on;
	}

	public void moveMatrix(boolean right, int units) {
		
	}
	public void changeMatrix(PixelBW[][] newMatrix) {
		if (on = false)
			on = true;
		matrix = newMatrix;
	}

	public void turnOff() {
		on = false;
		matrix = null;
	}

	public void test() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j].test_on_off();
			}
		}
	}

}
