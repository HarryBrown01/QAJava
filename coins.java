package qajava;

import java.util.Scanner;

public class coins {
	public static void method1(int num1) {		
        int change = num1;
        
        while (change > 0){
    		if (change > 5000) {
    			System.out.println("1 £50 note");
    			change -= 5000;
    		} else if (change > 2000){
    			System.out.println("1 £20 note");
    			change -= 2000;
    		} else if (change > 1000){
    			System.out.println("1 £10 note");
    			change -= 1000;
    		} else if (change > 500){
    			System.out.println("1 £5 note");
    			change -= 500;
    		} else if (change > 200){
    			System.out.println("1 £2 note");
    			change -= 200;
    		} else if (change > 100){
    			System.out.println("1 £1 note");
    			change -= 100;
    		} else if (change > 50){
    			System.out.println("1 50p");
    			change -= 50;
    		} else if (change > 20){
    			System.out.println("1 20p");
    			change -= 20;
    		} else if (change > 10){
    			System.out.println("1 10p");
    			change -= 10;
    		} else if (change > 5){
    			System.out.println("1 5p");
    			change -= 5;
    		} else if (change > 2){
    			System.out.println("1 2p");
    			change -= 2;
    		} else if (change > 1){
    			System.out.println("1 1p");
    			change -= 1;
    		} else {
    			System.out.println("1 1p");
    			change -= 1;
    		}
    	}
        System.out.println("Change delivered");
    }
	
	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		
		try (Scanner scanObject = new Scanner(System.in)) {
			System.out.println("Please enter amount owed: ");
			num1 = scanObject.nextInt();
			System.out.println("Please enter amount payed: ");
			num2 = scanObject.nextInt();
		}
		
		int diff = 0;
		
		if (num1 > num2){
			diff = num1 - num2;
			method1(diff);
        } else {
        	System.out.println("No change is owed");
        }
	}
}
