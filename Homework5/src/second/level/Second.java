package second.level;

import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		int [] array = new int [] {7, 2, 9, 4};
		
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		int x = 0; // допоміжна змінна
		for(int i = 0; i < array.length / 2; i++) {
			x = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = x;
		}
		System.out.println(Arrays.toString(array));
	}
}