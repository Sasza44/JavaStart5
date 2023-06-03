package first.level;

public class First {

	public static void main(String[] args) {
		int [] array = new int[] {0, 5, 2, 4, 7, 1, 3, 19};
		// розрахунок кількості непарних чисел в масиві
		
		int a = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				a += 1;
			}
		}
		System.out.println(a);
	}
}