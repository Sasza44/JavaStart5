package second.level;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		int [][] array1 = new int[][]{{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
		for(int [] row: array1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		
		int x = 0; // допоміжна змінна
		for(int i = 0; i < array1.length; i++) { // поворот масиву на 90 градусів
			for(int j = i + 1; j < array1.length; j++) {
				x = array1[i][j];
				array1[i][j] = array1[j][i];
				array1[j][i] = x;
			}
		}
		for(int [] row: array1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		
		x = 0;
		for(int i = 0; i < array1.length; i++) { // поворот масиву на 180 градусів
			for(int j = 0; j < array1.length - i - 1; j++) {
				x = array1[i][j];
				array1[i][j] = array1[array1.length - 1 - j][array1.length - 1 - i];
				array1[array1.length - 1 - j][array1.length - 1 - i] = x;
			}
		}
		for(int [] row: array1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		
		x = 0;
		for(int i = 0; i < array1.length; i++) { // поворот масиву на 270 градусів
			for(int j = i + 1; j < array1.length; j++) {
				x = array1[i][j];
				array1[i][j] = array1[j][i];
				array1[j][i] = x;
			}
		}
		for(int [] row: array1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}
}