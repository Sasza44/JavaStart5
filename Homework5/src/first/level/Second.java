package first.level;

import java.util.Arrays;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l; // довжина масива
		System.out.println("Write array length ");
		l = sc.nextInt();
		int [] array = new int[l];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Write next number ");
			array[i] = sc.nextInt();
		}
		
		String arr = Arrays.toString(array);
		System.out.println(arr);
	}
}