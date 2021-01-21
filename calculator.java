package qajava;

import java.util.*;

public class calculator {
	
	public static void method1(double num1, double num2) {
		double answer = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+answer);
	}
	
	public static void method2(double num1, double num2) {
		double answer = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+answer);
	}
	
	public static void method3(double num1, double num2) {
		double answer = num1 * num2;
		System.out.println(num1+" * "+num2+" = "+answer);
	}
	
	public static void method4(double num1, double num2) {
		double answer = num1 / num2;
		System.out.println(num1+" / "+num2+" = "+answer);
	}
	
	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		char operator;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter first number: ");
			num1 = scanObject.nextDouble();
			System.out.println("Please enter second number: ");
			num2 = scanObject.nextDouble();
			System.out.println("What operation: ");
			operator = scanObject.next().charAt(0);
		}
		
		switch (operator) {
			case '+': method1(num1, num2);
			break;
			case '-': method2(num1, num2);
			break;
			case '*': method3(num1, num2);
			break;
			case '/': method4(num1, num2);
			break;
		}
	}
}
