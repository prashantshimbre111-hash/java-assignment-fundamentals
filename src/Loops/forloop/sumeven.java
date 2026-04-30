package Loops.forloop;

import java.util.Scanner;

public class sumeven {
	
	public static void main(String[] args) {
		
		//print sum of even number between 1 to n.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("print number here : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i<=n ; i+=2) {
			
			sum =sum + i;
		}
		System.out.println(sum);
	}

}
