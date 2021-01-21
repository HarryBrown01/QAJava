package qajava;

import java.util.Scanner;

public class taxes {
	public static void method1(double num1) {
		double tax = 0;
		if (num1<15000) {
			tax = 0;
			System.out.println("You will be taxed "+tax+"%");
		} else if (num1<20000) {
			tax = 10;
			System.out.println("You will be taxed "+tax+"%");
		} else if (num1<30000) {
			tax = 15;
			System.out.println("You will be taxed "+tax+"%");
		} else if (num1<45000) {
			tax = 20;
			System.out.println("You will be taxed "+tax+"%");
		} else {
			tax = 25;
			System.out.println("You will be taxed "+tax+"%");
		}
		method2(num1, tax);
	}
	
	public static void method2(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("You will be taxed £0");
		} else if (num2 == 10){
			System.out.println("You will be taxed £"+(num1*0.1));
		} else if (num2 == 15){
			System.out.println("You will be taxed £"+(num1*0.15));
		} else if (num2 == 20){
			System.out.println("You will be taxed £"+(num1*0.2));
		} else if (num2 == 25){
			System.out.println("You will be taxed £"+(num1*0.25));
		}
	}
	
	public static void main(String[] args) {
		double num1 = 0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter salary: ");
			num1 = scanObject.nextDouble();
		}
		method1(num1);
	}
}