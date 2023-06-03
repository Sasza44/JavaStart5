package first.level;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("Write text ");
		text = sc.nextLine();
		
		char b = 'b'; // символ, який шукає програма
		int n = 0; // кількість символів b в рядку
		int i = -2; // індекс пошуку символу b
		
		System.out.println("Length = " + text.length());
		
		while(i != -1) {
			if(i == -2) {
				i = text.indexOf(b);
				if(i != -1) {
					n += 1;
				}
			}
			else {
				if(i < text.length() - 1) {
					i = text.indexOf(b, i + 1);
					if(i != -1) {
						n += 1;
					}
				}
				else {
					i = -1;
				}
			}
		}
		
		System.out.println("Number = " + n);
	}
}