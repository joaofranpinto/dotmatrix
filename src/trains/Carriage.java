package trains;

public class Carriage {
	
	private int length;
	private int numberDoors;
	private int[][] positionDoors;
	private int CarriageNumber;
	
	
	/**
	 *
	 * @param length length of the carriage
	 * @param numberDoors number of doors of the carriage
	 * @param positionDoors positionDoors[numberDoor][begin of door(meters)][end of door(meters)]
	 * @param carriageNumber
	 */
	public Carriage(int length, int numberDoors, int[][] positionDoors, int carriageNumber) {
		this.length = length;
		this.numberDoors = numberDoors;
		this.positionDoors = positionDoors;
		CarriageNumber = carriageNumber;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	public int[][] getPositionDoors() {
		return positionDoors;
	}
	public void setPositionDoors(int[][] positionDoors) {
		this.positionDoors = positionDoors;
	}
	public int getCarriageNumber() {
		return CarriageNumber;
	}
	public void setCarriageNumber(int carriageNumber) {
		CarriageNumber = carriageNumber;
	}
	
	
}
