package second.level;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money;
		System.out.println("How much money do you have? ");
		money = sc.nextDouble();
		double money1 = 453_956_234.87; // додаткова змінна для налагодження програми
		
		int millions = (int)money / 1000000;
		//System.out.println(millions);
		int h1 = millions / 100; // сотні
		int t1 = (millions - h1 * 100) / 10; // десяткм
		int u1 = millions - h1 * 100 - t1 * 10; // одиниці
		String h11 = "";
		if(h1 == 1) {h11 = "one hundred";}
		else if(h1 == 2) {h11 = "two hundred";}
		else if(h1 == 3) {h11 = "three hundred";}
		else if(h1 == 4) {h11 = "four hundred";}
		else if(h1 == 5) {h11 = "five hundred";}
		else if(h1 == 6) {h11 = "six hundred";}
		else if(h1 == 7) {h11 = "seven hundred";}
		else if(h1 == 8) {h11 = "eight hundred";}
		else if(h1 == 9) {h11 = "nine hundred";}
		String t11 = "";
		if(t1 == 2) {t11 = " twenty";}
		else if(t1 == 3) {t11 = " thirty";}
		else if(t1 == 4) {t11 = " forty";}
		else if(t1 == 5) {t11 = " fifty";}
		else if(t1 == 6) {t11 = " sixty";}
		else if(t1 == 7) {t11 = " seventy";}
		else if(t1 == 8) {t11 = " eighty";}
		else if(t1 == 9) {t11 = " ninety";}
		String u11 = "";
		if(t1 != 1 && u1 == 1) {u11 = " one";}
		else if(t1 != 1 && u1 == 2) {u11 = " two";}
		else if(t1 != 1 && u1 == 3) {u11 = " three";}
		else if(t1 != 1 && u1 == 4) {u11 = " four";}
		else if(t1 != 1 && u1 == 5) {u11 = " five";}
		else if(t1 != 1 && u1 == 6) {u11 = " six";}
		else if(t1 != 1 && u1 == 7) {u11 = " seven";}
		else if(t1 != 1 && u1 == 8) {u11 = " eight";}
		else if(t1 != 1 && u1 == 9) {u11 = " nine";}
		else if(t1 == 1 && u1 == 0) {u11 = " ten";}
		else if(t1 == 1 && u1 == 1) {u11 = " eleven";}
		else if(t1 == 1 && u1 == 2) {u11 = " twelve";}
		else if(t1 == 1 && u1 == 3) {u11 = " thirteen";}
		else if(t1 == 1 && u1 == 4) {u11 = " fourteen";}
		else if(t1 == 1 && u1 == 5) {u11 = " fifteen";}
		else if(t1 == 1 && u1 == 6) {u11 = " sixteen";}
		else if(t1 == 1 && u1 == 7) {u11 = " seventeen";}
		else if(t1 == 1 && u1 == 8) {u11 = " eighteen";}
		else if(t1 == 1 && u1 == 9) {u11 = " nineteen";}
		//System.out.println(h11 + t11 + u11);
		String millions11 = "";
		if(h11 != "" || t11 != "" || u11 != "") {millions11 = h11 + t11 + u11 + " millions ";}
		//System.out.println(millions11);
		
		int thousands = ((int)money - millions * 1000000) / 1000;
		//System.out.println(thousands);
		int h2 = thousands / 100; // сотні
		int t2 = (thousands - h2 * 100) / 10; // десяткм
		int u2 = thousands - h2 * 100 - t2 * 10; // одиниці
		String h22 = "";
		if(h2 == 1) {h22 = "one hundred";}
		else if(h2 == 2) {h22 = "two hundred";}
		else if(h2 == 3) {h22 = "three hundred";}
		else if(h2 == 4) {h22 = "four hundred";}
		else if(h2 == 5) {h22 = "five hundred";}
		else if(h2 == 6) {h22 = "six hundred";}
		else if(h2 == 7) {h22 = "seven hundred";}
		else if(h2 == 8) {h22 = "eight hundred";}
		else if(h2 == 9) {h22 = "nine hundred";}
		String t22 = "";
		if(t2 == 2) {t22 = " twenty";}
		else if(t2 == 3) {t22 = " thirty";}
		else if(t2 == 4) {t22 = " forty";}
		else if(t2 == 5) {t22 = " fifty";}
		else if(t2 == 6) {t22 = " sixty";}
		else if(t2 == 7) {t22 = " seventy";}
		else if(t2 == 8) {t22 = " eighty";}
		else if(t2 == 9) {t22 = " ninety";}
		String u22 = "";
		if(t2 != 1 && u2 == 1) {u22 = " one";}
		else if(t2 != 1 && u2 == 2) {u22 = " two";}
		else if(t2 != 1 && u2 == 3) {u22 = " three";}
		else if(t2 != 1 && u2 == 4) {u22 = " four";}
		else if(t2 != 1 && u2 == 5) {u22 = " five";}
		else if(t2 != 1 && u2 == 6) {u22 = " six";}
		else if(t2 != 1 && u2 == 7) {u22 = " seven";}
		else if(t2 != 1 && u2 == 8) {u22 = " eight";}
		else if(t2 != 1 && u2 == 9) {u22 = " nine";}
		else if(t2 == 1 && u2 == 0) {u22 = " ten";}
		else if(t2 == 1 && u2 == 1) {u22 = " eleven";}
		else if(t2 == 1 && u2 == 2) {u22 = " twelve";}
		else if(t2 == 1 && u2 == 3) {u22 = " thirteen";}
		else if(t2 == 1 && u2 == 4) {u22 = " fourteen";}
		else if(t2 == 1 && u2 == 5) {u22 = " fifteen";}
		else if(t2 == 1 && u2 == 6) {u22 = " sixteen";}
		else if(t2 == 1 && u2 == 7) {u22 = " seventeen";}
		else if(t2 == 1 && u2 == 8) {u22 = " eighteen";}
		else if(t2 == 1 && u2 == 9) {u22 = " nineteen";}
		String thousands22 = "";
		if(h22 != "" || t22 != "" || u22 != "") {thousands22 = h22 + t22 + u22 + " thousands ";}
		
		int units = (int)money - millions * 1000000 - thousands * 1000;
		//System.out.println(units);
		int h3 = units / 100; // сотні
		int t3 = (units - h3 * 100) / 10; // десяткм
		int u3 = units - h3 * 100 - t3 * 10; // одиниці
		String h33 = "";
		if(h3 == 1) {h33 = "one hundred";}
		else if(h3 == 2) {h33 = "two hundred";}
		else if(h3 == 3) {h33 = "three hundred";}
		else if(h3 == 4) {h33 = "four hundred";}
		else if(h3 == 5) {h33 = "five hundred";}
		else if(h3 == 6) {h33 = "six hundred";}
		else if(h3 == 7) {h33 = "seven hundred";}
		else if(h3 == 8) {h33 = "eight hundred";}
		else if(h3 == 9) {h33 = "nine hundred";}
		String t33 = "";
		if(t3 == 2) {t33 = " twenty";}
		else if(t3 == 3) {t33 = " thirty";}
		else if(t3 == 4) {t33 = " forty";}
		else if(t3 == 5) {t33 = " fifty";}
		else if(t3 == 6) {t33 = " sixty";}
		else if(t3 == 7) {t33 = " seventy";}
		else if(t3 == 8) {t33 = " eighty";}
		else if(t3 == 9) {t33 = " ninety";}
		String u33 = "";
		if(t3 != 1 && u3 == 1) {u33 = " one";}
		else if(t3 != 1 && u3 == 2) {u33 = " two";}
		else if(t3 != 1 && u3 == 3) {u33 = " three";}
		else if(t3 != 1 && u3 == 4) {u33 = " four";}
		else if(t3 != 1 && u3 == 5) {u33 = " five";}
		else if(t3 != 1 && u3 == 6) {u33 = " six";}
		else if(t3 != 1 && u3 == 7) {u33 = " seven";}
		else if(t3 != 1 && u3 == 8) {u33 = " eight";}
		else if(t3 != 1 && u3 == 9) {u33 = " nine";}
		else if(t3 == 1 && u3 == 0) {u33 = " ten";}
		else if(t3 == 1 && u3 == 1) {u33 = " eleven";}
		else if(t3 == 1 && u3 == 2) {u33 = " twelve";}
		else if(t3 == 1 && u3 == 3) {u33 = " thirteen";}
		else if(t3 == 1 && u3 == 4) {u33 = " fourteen";}
		else if(t3 == 1 && u3 == 5) {u33 = " fifteen";}
		else if(t3 == 1 && u3 == 6) {u33 = " sixteen";}
		else if(t3 == 1 && u3 == 7) {u33 = " seventeen";}
		else if(t3 == 1 && u3 == 8) {u33 = " eighteen";}
		else if(t3 == 1 && u3 == 9) {u33 = " nineteen";}
		String units33 = "";
		if(h33 != "" || t33 != "" || u33 != "") {units33 = h33 + t33 + u33;}
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