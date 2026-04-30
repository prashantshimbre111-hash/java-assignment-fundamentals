package Loops.forloop;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {
		
		//we have to count digit in a number with for loop.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter input here : ");
		int n = sc.nextInt();
		
		int count = 0;
		
	
		
		for (int i = 0 ; n!=0 ; count++) {
			
			n =n/10;			
		
		}
		System.out.println(count);
		
	
	}

}

