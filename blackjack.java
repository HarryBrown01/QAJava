package qajava;

import java.util.Scanner;

public class blackjack {
	public static void method1(double num1, double num2) {
		double player1 = num1;
		double player2 = num2;
		
		if (player1>21){
			player1 = 0;
		} else if (player1<1){
			player1 = 0;
		}
		if (player2>21){
			player2 = 0;
		} else if (player2<1) {
			player2 = 0;
		}
		
		if (player1>player2){
			System.out.println(player1);
		} else if (player1<player2){
			System.out.println(player2);
		} else {
			System.out.println(0);
		}
	}
	
	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter first number: ");
			num1 = scanObject.nextDouble();
			System.out.println("Please enter second number: ");
			num2 = scanObject.nextDouble();
		}
		
		method1(num1, num2);
	}
}