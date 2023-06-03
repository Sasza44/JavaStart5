package second.level;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		int [][] array1 = new int[][]{{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
		for(int [] row: array1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		
		int [][] array2 = new int[6][6]; // копія масиву (його повернемо на 180 градусів)
		int [][] array3 = new int[6][6]; // копія масиву (його повернемо на 270 градусів)
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				array2[i][j] = array1[i][j];
			}
		}
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				array3[i][j] = array1[i][j];
			}
		}
		
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
		
		for(int i = 0; i < array2.length; i++) { // поворот масиву на 180 градусів
			for(int j = array2.length / 2; j < array2.length; j++) {
				x = array2[i][j];
				array2[i][j] = array2[i][array2.length - 1 - j];
				array2[i][array2.length - 1 - j] = x;
			}
		}
		for(int [] row: array2) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
		
		for(int i = 0; i < array3.length - 1; i++) { // поворот масиву на 270 градусів
			for(int j = 0; j < array3.length - 1 - i; j++) {
				x = array3[i][j];
				array3[i][j] = array3[array2.length - 1 - j][array2.length - 1 - i];
				array3[array2.length - 1 - j][array2.length - 1 - i] = x;
			}	
		}
		for(int [] row: array3) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}
}