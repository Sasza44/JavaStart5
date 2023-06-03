package second.level;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money;
		System.out.println("How much money do you have? ");
		money = sc.nextDouble();
		double money1 = 453_956_234.87; // додаткова змінна для налагодження програми
		
		int [] dollarsArray = new int[3];
		String [] dollarsArray1 = new String[3];
		dollarsArray[0] = (int)money / 1000000; // мільйони
		dollarsArray[1] = ((int)money - dollarsArray[0] * 1000000) / 1000; // тисячі
		dollarsArray[2] = (int)money - dollarsArray[0] * 1000000 - dollarsArray[1] * 1000; // одиниці
		
		for(int i = 0; i < dollarsArray.length; i++) {
			int h = dollarsArray[i] / 100; // сотні
			int t = (dollarsArray[i] - h * 100) / 10; // десяткм
			int u = dollarsArray[i] - h * 100 - t * 10; // одиниці
			
			String h123 = "";
			if(h == 1) {h123 = "one hundred";}
			else if(h == 2) {h123 = "two hundred";}
			else if(h == 3) {h123 = "three hundred";}
			else if(h == 4) {h123 = "four hundred";}
			else if(h == 5) {h123 = "five hundred";}
			else if(h == 6) {h123 = "six hundred";}
			else if(h == 7) {h123 = "seven hundred";}
			else if(h == 8) {h123 = "eight hundred";}
			else if(h == 9) {h123 = "nine hundred";}
			String t123 = "";
			if(t == 2) {t123 = " twenty";}
			else if(t == 3) {t123 = " thirty";}
			else if(t == 4) {t123 = " forty";}
			else if(t == 5) {t123 = " fifty";}
			else if(t == 6) {t123 = " sixty";}
			else if(t == 7) {t123 = " seventy";}
			else if(t == 8) {t123 = " eighty";}
			else if(t == 9) {t123 = " ninety";}
			String u123 = "";
			if(t != 1 && u == 1) {u123 = " one";}
			else if(t != 1 && u == 2) {u123 = " two";}
			else if(t != 1 && u == 3) {u123 = " three";}
			else if(t != 1 && u == 4) {u123 = " four";}
			else if(t != 1 && u == 5) {u123 = " five";}
			else if(t != 1 && u == 6) {u123 = " six";}
			else if(t != 1 && u == 7) {u123 = " seven";}
			else if(t != 1 && u == 8) {u123 = " eight";}
			else if(t != 1 && u == 9) {u123 = " nine";}
			else if(t == 1 && u == 0) {u123 = " ten";}
			else if(t == 1 && u == 1) {u123 = " eleven";}
			else if(t == 1 && u == 2) {u123 = " twelve";}
			else if(t == 1 && u == 3) {u123 = " thirteen";}
			else if(t == 1 && u == 4) {u123 = " fourteen";}
			else if(t == 1 && u == 5) {u123 = " fifteen";}
			else if(t == 1 && u == 6) {u123 = " sixteen";}
			else if(t == 1 && u == 7) {u123 = " seventeen";}
			else if(t == 1 && u == 8) {u123 = " eighteen";}
			else if(t == 1 && u == 9) {u123 = " nineteen";}
			
			dollarsArray1[i] = h123 + t123 + u123;
		}
		
		String millions11 = "";
		if(dollarsArray[0] != 0) {millions11 = dollarsArray1[0] + " millions ";}
		
		String thousands22 = "";
		if(dollarsArray[1] != 0) {thousands22 = dollarsArray1[1] + " thousands ";}
		
		String units33 = "";
		if(dollarsArray[2] != 0) {units33 = dollarsArray1[2];}
		
		String dollars = "";
		if(millions11 != "" || thousands22 != "" || units33 != "") {dollars = millions11 + thousands22 + units33 + " dollars ";}
		
		int cents = (int)((money - (int)money) * 100);
		//System.out.println(cents);
		int t4 = cents / 10;
		int u4 = cents - t4 * 10;
		String t44 = "";
		if(t4 == 2) {t44 = " twenty";}
		else if(t4 == 3) {t44 = " thirty";}
		else if(t4 == 4) {t44 = " forty";}
		else if(t4 == 5) {t44 = " fifty";}
		else if(t4 == 6) {t44 = " sixty";}
		else if(t4 == 7) {t44 = " seventy";}
		else if(t4 == 8) {t44 = " eighty";}
		else if(t4 == 9) {t44 = " ninety";}
		String u44 = "";
		if(t4 != 1 && u4 == 1) {u44 = " one";}
		else if(t4 != 1 && u4 == 2) {u44 = " two";}
		else if(t4 != 1 && u4 == 3) {u44 = " three";}
		else if(t4 != 1 && u4 == 4) {u44 = " four";}
		else if(t4 != 1 && u4 == 5) {u44 = " five";}
		else if(t4 != 1 && u4 == 6) {u44 = " six";}
		else if(t4 != 1 && u4 == 7) {u44 = " seven";}
		else if(t4 != 1 && u4 == 8) {u44 = " eight";}
		else if(t4 != 1 && u4 == 9) {u44 = " nine";}
		else if(t4 == 1 && u4 == 0) {u44 = " ten";}
		else if(t4 == 1 && u4 == 1) {u44 = " eleven";}
		else if(t4 == 1 && u4 == 2) {u44 = " twelve";}
		else if(t4 == 1 && u4 == 3) {u44 = " thirteen";}
		else if(t4 == 1 && u4 == 4) {u44 = " fourteen";}
		else if(t4 == 1 && u4 == 5) {u44 = " fifteen";}
		else if(t4 == 1 && u4 == 6) {u44 = " sixteen";}
		else if(t4 == 1 && u4 == 7) {u44 = " seventeen";}
		else if(t4 == 1 && u4 == 8) {u44 = " eighteen";}
		else if(t4 == 1 && u4 == 9) {u44 = " nineteen";}
		String cents44 = "";
		if(t44 != "" || u44 != "") {cents44 = t44 + u44 + " cents";}
		
		String sum = "none";
		if(dollars != "" || cents44 != "") {sum = dollars + cents44;}
		System.out.println(sum);
	}
}