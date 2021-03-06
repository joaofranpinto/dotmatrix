





package characters;

import software.PixelBW;

public class Character {
	public Character() {
	}

	public static PixelBW[][] charToMatrix(char c, int length, int width) {
		if (length != 5 && width != 7 || length != 8 && width == 8)
			throw new IllegalStateException(
					"Not a valid size. Valid sizes: Lenght=5 and Width=7 or Length=Width=8(square)");
		else {
			if (length == 5 && width == 7) {
				PixelBW[][] matrix = new PixelBW[5][7];
				switch (c) {
				case ' ':
				case 'a':
					matrix[0][5].turnOn();
					matrix[1][2].turnOn();
					matrix[1][4].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][4].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][4].turnOn();
					matrix[3][6].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();

				case 'A':
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][1].turnOn();
					matrix[1][4].turnOn();
					matrix[2][4].turnOn();
					matrix[2][4].turnOn();
					matrix[3][1].turnOn();
					matrix[3][4].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'b':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][3].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][6].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'B':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[1][3].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][3].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][3].turnOn();
					matrix[3][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'c':
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][2].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
				case 'C':
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][5].turnOn();
				case 'd':
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][5].turnOn();
					matrix[1][2].turnOn();
					matrix[2][6].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[3][6].turnOn();
					matrix[4][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'D':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'e':
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][2].turnOn();
					matrix[1][4].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][4].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][4].turnOn();
					matrix[3][6].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
				case 'E':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[1][3].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][3].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][3].turnOn();
					matrix[3][6].turnOn();
					matrix[4][0].turnOn();
					matrix[4][6].turnOn();
				case 'f':
					matrix[0][3].turnOn();
					matrix[1][1].turnOn();
					matrix[1][2].turnOn();
					matrix[1][3].turnOn();
					matrix[1][4].turnOn();
					matrix[1][5].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][3].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
				case 'F':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[1][3].turnOn();
					matrix[2][0].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
				case 'g':
					matrix[0][3].turnOn();
					matrix[1][2].turnOn();
					matrix[1][4].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][4].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][4].turnOn();
					matrix[3][6].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'G':
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][3].turnOn();
					matrix[3][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'h':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][3].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'H':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[4][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'i':
					matrix[1][3].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
				case 'I':
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][1].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][6].turnOn();
				case 'j':
					matrix[4][0].turnOn();
					matrix[3][2].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][5].turnOn();
				case 'J':
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
					matrix[3][1].turnOn();
					matrix[3][2].turnOn();
					matrix[3][3].turnOn();
					matrix[3][4].turnOn();
					matrix[3][5].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
				case 'k':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][4].turnOn();
					matrix[2][3].turnOn();
					matrix[2][5].turnOn();
					matrix[3][2].turnOn();
					matrix[3][6].turnOn();
				case 'K':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][3].turnOn();
					matrix[2][2].turnOn();
					matrix[2][4].turnOn();
					matrix[3][1].turnOn();
					matrix[3][5].turnOn();
					matrix[4][0].turnOn();
					matrix[4][6].turnOn();
				case 'l':
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][1].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
				case 'L':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
				case 'm':
					matrix[0][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
					matrix[1][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][5].turnOn();
					matrix[2][4].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'M':
					matrix[0][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
					matrix[0][1].turnOn();
					matrix[0][0].turnOn();
					matrix[4][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
					matrix[3][1].turnOn();
					matrix[1][1].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();

				case 'n':
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][3].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();

				case 'N':
					matrix[0][1].turnOn();
					matrix[0][0].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[4][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
					matrix[4][1].turnOn();
					matrix[4][0].turnOn();
					matrix[1][2].turnOn();
					matrix[2][3].turnOn();
					matrix[3][4].turnOn();
				case 'o':
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][2].turnOn();
					matrix[1][6].turnOn();
					matrix[2][2].turnOn();
					matrix[2][6].turnOn();
					matrix[3][2].turnOn();
					matrix[3][6].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'O':
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][0].turnOn();
					matrix[2][6].turnOn();
					matrix[3][0].turnOn();
					matrix[3][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
				case 'p':
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[0][2].turnOn();
					matrix[1][2].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
					matrix[3][4].turnOn();
					matrix[2][4].turnOn();
					matrix[1][4].turnOn();
				case 'P':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[3][3].turnOn();
					matrix[2][3].turnOn();
					matrix[1][3].turnOn();
				case 'q':
					matrix[0][3].turnOn();
					matrix[1][2].turnOn();
					matrix[2][2].turnOn();
					matrix[1][4].turnOn();
					matrix[2][4].turnOn();
					matrix[3][4].turnOn();
					matrix[3][4].turnOn();
					matrix[3][3].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][2].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
				case 'Q':
					matrix[0][2].turnOn();
					matrix[0][1].turnOn();
					matrix[2][0].turnOn();
					matrix[1][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[3][5].turnOn();
					matrix[2][4].turnOn();
					matrix[4][6].turnOn();
					matrix[2][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
				case 'r':
					matrix[0][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
					matrix[1][3].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
				case 'R':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[3][3].turnOn();
					matrix[2][3].turnOn();
					matrix[1][3].turnOn();
					matrix[2][4].turnOn();
					matrix[3][5].turnOn();
					matrix[4][6].turnOn();
				case 's':
					matrix[3][2].turnOn();
					matrix[2][2].turnOn();
					matrix[1][2].turnOn();
					matrix[0][3].turnOn();
					matrix[1][4].turnOn();
					matrix[3][4].turnOn();
					matrix[2][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][6].turnOn();
				case 'S':
					matrix[4][1].turnOn();
					matrix[3][0].turnOn();
					matrix[2][0].turnOn();
					matrix[1][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
				case 't':
					matrix[1][0].turnOn();
					matrix[1][1].turnOn();
					matrix[1][2].turnOn();
					matrix[1][3].turnOn();
					matrix[1][4].turnOn();
					matrix[1][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
					matrix[0][2].turnOn();
					matrix[2][2].turnOn();
				case 'T':
					matrix[2][0].turnOn();
					matrix[2][1].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
					matrix[0][0].turnOn();
					matrix[1][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
				case 'u':
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
					matrix[3][5].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
					matrix[0][1].turnOn();

				case 'U':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
					matrix[4][1].turnOn();
					matrix[4][0].turnOn();
				case 'v':
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[1][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
				case 'V':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[1][5].turnOn();
					matrix[2][6].turnOn();
					matrix[3][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
					matrix[4][2].turnOn();
					matrix[4][1].turnOn();
					matrix[4][1].turnOn();
					matrix[4][0].turnOn();
				case 'w':
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][6].turnOn();
					matrix[2][5].turnOn();
					matrix[2][4].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
				case 'W':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[0][4].turnOn();
					matrix[0][5].turnOn();
					matrix[1][6].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][3].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
					matrix[4][1].turnOn();
					matrix[4][0].turnOn();
				case 'x':
					matrix[0][6].turnOn();
					matrix[1][5].turnOn();
					matrix[2][4].turnOn();
					matrix[3][3].turnOn();
					matrix[4][2].turnOn();
					matrix[0][2].turnOn();
					matrix[1][3].turnOn();
					matrix[3][5].turnOn();
					matrix[4][6].turnOn();
				case 'X':
					matrix[0][6].turnOn();
					matrix[0][5].turnOn();
					matrix[1][4].turnOn();
					matrix[2][3].turnOn();
					matrix[3][2].turnOn();
					matrix[1][2].turnOn();
					matrix[3][4].turnOn();
					matrix[4][5].turnOn();
					matrix[4][6].turnOn();
					matrix[4][1].turnOn();
					matrix[4][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][0].turnOn();
				case 'y':
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][2].turnOn();
					matrix[3][4].turnOn();
					matrix[2][4].turnOn();
					matrix[1][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
				case 'Y':
					matrix[0][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[4][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[1][3].turnOn();
					matrix[3][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
				case 'z':
					matrix[0][2].turnOn();
					matrix[1][2].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][2].turnOn();
					matrix[3][3].turnOn();
					matrix[2][4].turnOn();
					matrix[1][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][6].turnOn();
				case 'Z':
					matrix[0][0].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
					matrix[0][6].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][6].turnOn();
					matrix[0][5].turnOn();
					matrix[1][4].turnOn();
					matrix[2][3].turnOn();
					matrix[3][2].turnOn();
					matrix[4][1].turnOn();
				case '0':
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[0][2].turnOn();
					matrix[0][1].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][4].turnOn();
					matrix[4][3].turnOn();
					matrix[4][5].turnOn();
					matrix[1][4].turnOn();
					matrix[2][3].turnOn();
					matrix[3][2].turnOn();
				case '1':
					matrix[1][1].turnOn();
					matrix[2][0].turnOn();
					matrix[2][1].turnOn();
					matrix[2][2].turnOn();
					matrix[2][3].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[3][6].turnOn();
				case '2':
					matrix[0][1].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[3][3].turnOn();
					matrix[2][3].turnOn();
					matrix[1][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][6].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][6].turnOn();
				case '3':
					matrix[0][1].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[3][3].turnOn();
					matrix[2][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
				case '4':
					matrix[3][0].turnOn();
					matrix[3][1].turnOn();
					matrix[3][2].turnOn();
					matrix[3][3].turnOn();
					matrix[3][4].turnOn();
					matrix[3][5].turnOn();
					matrix[3][6].turnOn();
					matrix[4][4].turnOn();
					matrix[2][4].turnOn();
					matrix[1][4].turnOn();
					matrix[0][4].turnOn();
					matrix[0][3].turnOn();
					matrix[1][2].turnOn();
					matrix[2][1].turnOn();
				case '5':
					matrix[0][0].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
					matrix[1][2].turnOn();
					matrix[2][2].turnOn();
					matrix[3][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][6].turnOn();
				case '6':
					matrix[3][0].turnOn();
					matrix[2][0].turnOn();
					matrix[1][1].turnOn();
					matrix[0][2].turnOn();
					matrix[0][2].turnOn();
					matrix[0][3].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[4][4].turnOn();
					matrix[4][4].turnOn();
					matrix[4][5].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
				case '7':
					matrix[0][0].turnOn();
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][0].turnOn();
					matrix[4][1].turnOn();
					matrix[2][3].turnOn();
					matrix[3][2].turnOn();
					matrix[1][4].turnOn();
					matrix[1][5].turnOn();
					matrix[1][6].turnOn();
				case '8':
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[3][6].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[4][5].turnOn();
					matrix[4][4].turnOn();
					matrix[0][5].turnOn();
					matrix[0][4].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[4][2].turnOn();
					matrix[4][1].turnOn();
					matrix[0][1].turnOn();
					matrix[0][2].turnOn();
				case '9':
					matrix[1][0].turnOn();
					matrix[2][0].turnOn();
					matrix[3][0].turnOn();
					matrix[4][1].turnOn();
					matrix[4][2].turnOn();
					matrix[4][3].turnOn();
					matrix[4][4].turnOn();
					matrix[3][5].turnOn();
					matrix[2][6].turnOn();
					matrix[1][6].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[0][2].turnOn();
					matrix[0][1].turnOn();
				case '.':
					matrix[2][6].turnOn();
					matrix[2][5].turnOn();
					matrix[1][5].turnOn();
					matrix[1][6].turnOn();
				case ',':
					matrix[1][4].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[1][6].turnOn();
				case ';':
					matrix[1][4].turnOn();
					matrix[2][4].turnOn();
					matrix[2][5].turnOn();
					matrix[1][6].turnOn();
					matrix[1][2].turnOn();
					matrix[2][2].turnOn();
					matrix[2][1].turnOn();
					matrix[1][1].turnOn();
				case '-':
					matrix[0][3].turnOn();
					matrix[1][3].turnOn();
					matrix[2][3].turnOn();
					matrix[3][3].turnOn();
					matrix[4][3].turnOn();
				case '_':
					matrix[0][6].turnOn();
					matrix[1][6].turnOn();
					matrix[2][6].turnOn();
					matrix[3][6].turnOn();
					matrix[3][6].turnOn();
					matrix[4][6].turnOn();
				case '<':
					matrix[4][0].turnOn();
					matrix[3][1].turnOn();
					matrix[2][2].turnOn();
					matrix[1][3].turnOn();
					matrix[2][4].turnOn();
					matrix[3][5].turnOn();
					matrix[4][6].turnOn();
				case '>':
					matrix[0][6].turnOn();
					matrix[1][5].turnOn();
					matrix[2][4].turnOn();
					matrix[3][3].turnOn();
					matrix[2][2].turnOn();
					matrix[1][1].turnOn();
					matrix[0][0].turnOn();
				case '"':
					matrix[1][0].turnOn();
					matrix[1][1].turnOn();
					matrix[1][2].turnOn();
					matrix[3][0].turnOn();
					matrix[3][1].turnOn();
					matrix[3][2].turnOn();
				case '(':
				case ')':
				case '{':
				case '}':
				case '=':
				case '?':
				case '!':
				case ':':
				case '*':
				case '/':
				case '�':
				case '�':
				case '|':
				case '+':
				case '%':
				case '$':
				case '�':
				case '&':
				case '#':
				case '@':
				}
				return matrix;
			}
		}
		return null;
	}

}