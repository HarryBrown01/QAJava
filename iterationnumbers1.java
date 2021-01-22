package qajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iterationnumbers1 {
	public static void method1(int num1) {
		String number = String.valueOf(num1);
		char[] digits1 = number.toCharArray();
		
		List<Integer> myAList = new ArrayList<>();
		
		for (char i : digits1){
			myAList.add(Character.getNumericValue(i));
        }
		
		Object[] Farray = myAList.toArray();
		
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        
        if (num1 > 9999) {
            System.out.print("The number is too large");
        } else if (num1 > 999) {
            System.out.print(ones[(int) Farray[0]] + " THOUSAND " + ones[(int) Farray[1]] + " HUNDRED " + tens[(int) Farray[2]] + " " + ones[(int) Farray[3]]);
        } else if (num1 > 99) {
            System.out.print(ones[(int) Farray[0]] + " HUNDRED " + tens[(int) Farray[1]] + " " + ones[(int) Farray[2]]);
        } else if (num1 > 19) {
            System.out.print(tens[(int) Farray[0]] + " " + ones[(int) Farray[1]]);
        } else {
            System.out.print(ones[num1]);
        }
    }
	public static void main(String[] args) {
		int num1=0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter a number between 1-9999: ");
			num1 = scanObject.nextInt();
		}
		
		method1(num1);
    }
}
