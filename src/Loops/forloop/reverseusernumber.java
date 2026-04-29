package Loops.forloop;

import java.util.Scanner;

public class reverseusernumber {
	// 	Print numbers in reverse from n to 1 (user input).
	
		 public static void main(String[] args) {
			
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("please enter number here : ");
			 int n = sc.nextInt();
			 
			 for(int i = n ; i>=1 ; i--) {
				 
				 System.out.println(i);
			 }
		}

}
