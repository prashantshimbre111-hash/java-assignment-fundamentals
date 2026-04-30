package Loops.forloop;

import java.util.Scanner;

public class sumoddd {

	public static void main(String[] args) {
		
		//print sum of all odd numbers from 1 to n.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your number");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i<=n ; i+=2) {
			
			sum = sum+i;
			
		}
		System.out.println(sum);
		
		
	}
}
