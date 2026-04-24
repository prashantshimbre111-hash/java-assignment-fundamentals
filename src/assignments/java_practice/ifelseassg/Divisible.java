package assignments.java_practice.ifelseassg;

public class Divisible {
	public static void main(String[] args) {
		
		int a = 10;
		
		//if a is divisible bye 2 and 3 then it is a good number
		
		if(a % 2 ==0) {
			System.out.println("it is divisible by 2");
			
			if(a % 3 == 0) {
				System.out.println("It is a good number");
			}
		}
	}

}
