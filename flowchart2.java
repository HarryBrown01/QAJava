package qajava;

import java.util.Scanner;

public class flowchart2 {
	public static void method1(double num1) {
		if (num1>2000) {
			System.out.println("A");
			if (num1>6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (num1>4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (num1>100) {
				System.out.println("3");
				if (num1>600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (num1>500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	public static void main(String[] args) {
		double num1 = 0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter first number: ");
			num1 = scanObject.nextDouble();
		}
		method1(num1);
	}
}