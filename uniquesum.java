package qajava;

import java.util.Scanner;

public class uniquesum {
	public static void method1(double num1, double num2, double num3) {
		double value1 = 0;
		double value2 = 0;
		double value3 = 0;
		
		if (num1 != num2 && num1 != num3) {
			value1 = num1;
		}
		if (num2 != num1 && num2 != num3) {
			value2 = num2;
		}
		if (num3 != num1 && num3 != num2) {
			value3 = num3;
		}
		System.out.println(value1 + value2 + value3);
	}
	
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter first number: ");
			num1 = scanObject.nextDouble();
			System.out.println("Please enter second number: ");
			num2 = scanObject.nextDouble();
			System.out.println("Please enter third number: ");
			num3 = scanObject.nextDouble();
		}
		method1(num1, num2, num3);
	}
}
