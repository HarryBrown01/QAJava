package qajava;

public class enhancedforloops {
	public static boolean method1(int num1) {
		if (num1%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String[] myArray = {"Apple", "Orange", "Banana", "Grape", "Strawberry", "Melon"};
		
		for(String str : myArray) {
	        System.out.println(str);
	    }
		
		System.out.print('\n');
		
		int[] myArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int num : myArray2) {
	        System.out.println(num*num);
	    }
		
		System.out.print('\n');
		
		for(int num : myArray2) {
	        if (method1(num) == true) {
	        	System.out.println(num*num*num);
	        } else {
	        	System.out.println(num*num);
	        }
	    }
	}
}
