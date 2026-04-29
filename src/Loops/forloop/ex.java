package Loops.forloop;

import java.util.Scanner;


public class ex {
	
	// 	Print numbers from 1 to n but skip multiples of 5.
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plese eenter number here : ");
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 1 ; i<=n ; i++) {
			
			if(i%5==0) {
				
				
					continue;
		}
			System.out.println(i);
	}
}
	}
