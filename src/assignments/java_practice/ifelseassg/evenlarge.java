package assignments.java_practice.ifelseassg;

public class evenlarge {
	public static void main(String[] args) {
		
		//1.	Even or Odd Difference Input two integers.
		//Print the larger one only if it is even; else print the smaller one.


		int a = 51;
		int b =224;

		if (a > b) {

			if (a % 2 == 0) {

				System.out.println("a is larger number and also it it even number" + a);
			}
		}

		else {
			System.out.println("larger but odd : " +b);
		}
		
		if(b>a) {
			if(b%2== 0) {
				System.out.println("b is larger and also it is a even number");
			}
		}
		else {
			System.out.println("larger but odd : " + a);
		}
	}

}
