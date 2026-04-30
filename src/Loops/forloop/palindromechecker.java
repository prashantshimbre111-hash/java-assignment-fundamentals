package Loops.forloop;

import java.util.Scanner;

public class palindromechecker {

	public static void main(String[] args) {
		
		//Write a Program to Check Given Number is a Palindrome or Not.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter input");
		int input  =sc.nextInt();
		
		int reverse = 0;
		int original = input;
		
		
		for(int i = 0 ; input>0 ; i++) {
				int last  = input % 10;
			reverse = reverse*10 +last;
			input = input/10;
			
			
		}
		if(original==reverse) {
			System.out.println("it is palindrom");
		}
		else {
			System.out.println("it is not palindrome");
		}
		
		
	}
}
