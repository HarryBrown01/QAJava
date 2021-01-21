package qajava;

import java.util.Scanner;

public class flowchart {
	
	public static void method1(double num1, double num2, boolean bool1) {
		if (bool1 == true) {
			System.out.println(num1+num2);
		} else {
			System.out.println(num1*num2);
		}
	}
	
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		boolean bool1 = true;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter first number: ");
			num1 = scanObject.nextDouble();
			System.out.println("Please enter second number: ");
			num2 = scanObject.nextDouble();
			System.out.println("True of False: ");
			bool1 = scanObject.nextBoolean();
		}
		method1(num1, num2, bool1);
	}

}
