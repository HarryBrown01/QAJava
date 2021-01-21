package qajava;

public class stringmanipulation {
	public static void method1(String manipulate) {
		int wordCount = 0;

	    boolean word = false;
	    int endOfLine = manipulate.length() - 1;

	    for (int i = 0; i < manipulate.length(); i++) {
	        if (Character.isLetter(manipulate.charAt(i)) && i != endOfLine) {
	            word = true;
	        } else if (!Character.isLetter(manipulate.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	        } else if (Character.isLetter(manipulate.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    System.out.print(wordCount);
		System.out.print('\n');
    }
	public static void method2(String manipulate) {
		System.out.print('\n');
		String[] separated = manipulate.split(" ");

        for (Integer position = 0; position < separated.length; position++) {

            System.out.println(separated[position]);
        }
        System.out.print('\n');
    }
	public static void method3(String manipulate) {
		String[] separated = manipulate.split(" ");
		
		for (int i = 0; i < separated.length / 2; i++) {
	        Object temp = separated[i];
	        separated[i] = separated[separated.length - 1 - i];
	        separated[separated.length - 1 - i] = (String) temp;
	    }

        for (Integer position = 0; position < separated.length; position++) {

            System.out.println(separated[position]);
        }
		System.out.print('\n');
	}
	public static void method4(String manipulate, String submanipulate) {
		System.out.println("Contains sequence: " + manipulate.contains(submanipulate));
	}
	
	public static void main(String[] args) {
		String manipulate = "How much wood could a wood chuck chuck if a wood chuck could chuck wood";
		String submanipulate = "could";
		
		method1(manipulate);
		method2(manipulate);
		method3(manipulate);
		method4(manipulate, submanipulate);
    }
}
