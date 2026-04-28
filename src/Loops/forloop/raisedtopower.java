package Loops.forloop;

import java.util.Scanner;

public class raisedtopower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int input = sc.nextInt();
		
		int r2p = 1 ;
		for(int i = 1 ; i <=input ; i++) {
			
			r2p = r2p*+input;
		}
		System.out.println(r2p);
	}

}
