package qajava;

public class arrays {
	public static void method1() {
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
			System.out.print('\n');
		}
	}
	public static void method2() {
		System.out.print('\n');
		int[] myArray2 = new int[20];
		
		for(int i = 0; i < 20; i++) {
			myArray2[i] = i;
			System.out.print(myArray2[i]);
			System.out.print('\n');
		}
		System.out.print('\n');
		for(int i = 0; i < myArray2.length; i++) {
			myArray2[i] = myArray2[i] * 10;
			System.out.print(myArray2[i]);
			System.out.print('\n');
		}
	}
	
	public static void main(String[] args) {
		method1();
		method2();
	}
}
