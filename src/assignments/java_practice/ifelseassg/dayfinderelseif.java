package assignments.java_practice.ifelseassg;

import java.util.Scanner;

public class dayfinderelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int input = sc.nextInt();
		
		if(input==1) {
			
			System.out.println("monday");
		}else if(input==2) {
			
			System.out.println("tuesday");
		}else if(input==3) {
			
			System.out.println("wednesday");
		}else if(input==4) {
			
			System.out.println("thursday");
		}else if(input==5) {
			
			System.out.println("friday");
		}else if(input==6) {
			
			System.out.println("saturday");
		}else if(input==7) {
			
			System.out.println("sunday");
		}else {
			System.err.println("invalid number. Please enter correct number");
		}
		
		
		
	}

}
