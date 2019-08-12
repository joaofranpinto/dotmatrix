package software;

import trains.Train;
import trains.TrainType;

public class Panel {

	private DotMatrix[] panels;
	private int numberPanels;
	private int length;
	private int width;
	private DotMatrixModels model;
	private Train train;
	private double platformSize;
	public Panel(int length, int width, Train train,double platformSize, DotMatrixModels model) {
		this.platformSize = platformSize;
		this.train = train;
		this.length = length;
		this.width = width;
		this.model = model;
		newPanel();
	}
	
	
	public Train getTrain() {
		return train;
	}


	public void setTrain(Train train) {
		this.train = train;
	}


	public double getPlatformSize() {
		return platformSize;
	}


	public void setPlatformSize(double platformSize) {
		this.platformSize = platformSize;
	}


	public DotMatrix[] getPanels() {
		return panels;
	}


	public void setPanels(DotMatrix[] panels) {
		this.panels = panels;
	}


	public int getNumberPanels() {
		return numberPanels;
	}


	public void setNumberPanels(int numberPanels) {
		this.numberPanels = numberPanels;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public DotMatrixModels getModel() {
		return model;
	}


	public void setModel(DotMatrixModels model) {
		this.model = model;
	}


	private void newPanel() {
		numberPanels();
		// TODO Auto-generated method stub
		for(int i=0;i<numberPanels;i++) {
			DotMatrix matrix = new DotMatrix(new PixelBW[length][width], i, SpacingBetweenPixels.spacingBetweenPixels(model));
			panels[i] = matrix;
		}
	}

	//mudar para estatico se for necessario 
	//nao vai funcionar porque vão sobrar pixels á direita ou esquerda
	private void moveEveryPixel(int units, boolean right) {
		for(int i=0;i<numberPanels;i++) 
			panels[i].moveMatrix(right, units);
	}
	private void numberPanels() {
		// TODO Auto-generated method stub
		
	}
	
	private void showWarning() {
		
	}
	private void turnOff() {
		for(int i=0;i<numberPanels;i++) 
			panels[i].turnOff();
	}
	
	private void showInformation(Information info) {
		DotMatrix fullMatrix = info.getFullMatrix();
		double result;
			for(int x=0;x<fullMatrix.getMatrix().length;x++) {
				for(int y=0;y<fullMatrix.getMatrix()[0].length;y++) {
					result = x/fullMatrix.getMatrix().length;
					panels[(int) result].setOnePosition(new PixelBW(fullMatrix.getMatrix()[x][y].isOn()), x%((int)result), y);
				}
			}
	}
}
