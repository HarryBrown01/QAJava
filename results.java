package qajava;

public class results {
	
	public static void method1(int num1, int num2, int num3, int num4) {
		System.out.println("Results:");
		System.out.println("Physics: "+num1);
		System.out.println("Chemistry: "+num2);
		System.out.println("Biology: "+num3);
		System.out.println("Total: "+num4);
	}
	
	public static void method2(int num1) {
		int percentage = num1 * 100 / 450;
		System.out.println("");
		System.out.println("Percentage: "+percentage);
	}
	
	public static void main(String[] args) {
		int Physics = 112;
		int Chemistry = 75;
		int Biology = 143;
		int total = Physics + Chemistry + Biology;
		
		method1(Physics, Chemistry, Biology, total);
		method2(total);		
	}
}
