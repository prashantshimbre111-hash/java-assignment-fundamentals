package assignments.java_practice.ifelseassg;

public class bignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. Biggest Among Three Input 3 numbers.
		// Use nested if-else to find and print the greatest number.

		int a = 50;
		int b = 90;
		int c = 70;

		if (a > b) {
			if (a > c) {
				System.out.println("a is biggest :" + a);
			}
		}

		if (b > a) {
			if (b > c) {
				System.out.println("b is biggest : " + b);
			}
		}
		if (c > a) {
			if (c > b) {
				System.out.println("c is biggest : " + c);
			}
		}
	}
}
