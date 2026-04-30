package Loops.forloop;

import java.util.Scanner;

public class r2p {

	public static void main(String[] args) {
		// Write a program to find the value of one number raised to the power of
		// another

		Scanner sc = new Scanner(System.in);

		// we take first input as base
		System.out.println("please enter base number :");
		int base = sc.nextInt();

		// we take second input as raise to power number
		System.out.println("please enter raise to power number :");
		int raise = sc.nextInt();

		// we take result as one because result will be multiply with base number.
		int result = 1;
		
		//loop will run only upto raise to power number and each rotation will multiply base with result
		for (int i = 1; i <= raise; i++) {
			result = result * base;
		}
		System.out.println(result);
	}
}
