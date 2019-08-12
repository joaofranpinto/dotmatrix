package software;

public class SpacingBetweenPixels {

	public static double spacingBetweenPixels(DotMatrixModels model) {
		switch (model) {
		case EXAMPLE1:
			return 5.02;
		case EXAMPLE2:
			return 1.0;
		}
		return -1;

	}
}
