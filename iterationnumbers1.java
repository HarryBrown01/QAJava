package qajava;

import java.util.Scanner;

public class iterationnumbers1 {
	public static void method1(int num) {
		
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
    }
	
	public static void main(String[] args) {
		int num1=0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter number: ");
			num1 = scanObject.nextInt();
		}
		method1((num1 % 100));
	}
}