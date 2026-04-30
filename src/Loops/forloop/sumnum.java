package Loops.forloop;

import java.util.Scanner;

public class sumnum {

	public static void main(String[] args) {
		
		//we have to print sum of all number from 1 to n.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1 ; i<=n ; i++) {
			
		sum = sum + i;
			
			
		}
		System.out.println(sum);
		
		
	}
}
