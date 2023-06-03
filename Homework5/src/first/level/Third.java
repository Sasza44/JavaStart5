package first.level;

import java.util.Arrays;

public class Third {

	public static void main(String[] args) {
		int [] a1 = new int[15];
		for(int i = 0; i < a1.length; i++) {
			a1[i] = (int)(Math.random() * 100);
		}
		String a1s = Arrays.toString(a1);
		System.out.println(a1s);
		
		int [] a2 = new int[30];
		for(int i = 0; i < a2.length; i++) {
			if(i < a1.length) {
				a2[i] = a1[i];
			}
			else {
				a2[i] = 2 * a2[i - a1.length];
			}
		}
		String a2s = Arrays.toString(a2);
		System.out.println(a2s);
	}
}