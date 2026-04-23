package assignments.java_practice.ifelseassg;

public class leapyearchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int yr = 2025;
		
		if(yr % 4 == 0 ) {
			if(yr % 400 == 0) {
				if(yr % 100 == 0) {
					System.out.println("it is a not leap year");
			}
				else {
					System.out.println("it is a leap year");
				}
		}
			else {
				System.out.println("it is a leap year");
			}
		
		}
		
		else {
			System.out.println("it is a leap year");
		}
		
		
	}
}
		
			