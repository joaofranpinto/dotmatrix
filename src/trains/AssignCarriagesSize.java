package trains;

import java.util.ArrayList;

public class AssignCarriagesSize {
	
	public static Train assignCarriageSize(TrainType traintype, int numberTrains) {
		Train train;
		switch(traintype) {
		case CP2400:
			int numberCarriagesPerTrain = 3;
			Carriage[] carriages = new Carriage[numberCarriagesPerTrain*numberTrains];
			for(int i=0;i<numberTrains;i++) {
				//esta mal, o vetor foi iniciado com os valores em vez do tamanho...
				int Door0[] = {2,3};
				int Door1[] = {4,5};
				int Door2[] = {10,12};
				int numberOfDoors[][] = new int[3][2];
				numberOfDoors[0] = Door0;
				numberOfDoors[1] = Door1;
				numberOfDoors[2] = Door2;
				carriages[i] = new Carriage(50,3, numberOfDoors, numberCarriagesPerTrain);
			}
			return new Train(500,carriages);
		case CP4000:
			
		}
		return null;
		
	}

}
