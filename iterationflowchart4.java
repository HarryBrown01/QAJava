package qajava;

public class iterationflowchart4 {
	public static void method1() {
		for(int i = 0; i < 10; i++) {
			for(int p = 0; p < i; p++) {
				System.out.println(i);
			}
        }
	}
	
	public static void main(String[] args) {
		method1();
	}
}
