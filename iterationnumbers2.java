package qajava;

public class iterationnumbers2 {
	public static void method1(int num) {
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        if (num > 19) {
            System.out.print(tens[num / 10] + " " + ones[num % 10]);
        } else {
            System.out.print(ones[num]);
        }
    }
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			method1((i % 100));
			System.out.print('\n');
		}
    }
}