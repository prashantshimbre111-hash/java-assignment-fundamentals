package Loops.forloop;

import java.util.Scanner;

public class raisedtopower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number base number : ");
		int og = sc.nextInt();
		System.out.println("please enter raise to power number :");
		int raise = sc.nextInt();
		
		int result = 1;
			
		for(int i = 1 ; i<=raise ; i++) {
			result = result*og;	
			
			}
	System.out.println(result);
	}

}
