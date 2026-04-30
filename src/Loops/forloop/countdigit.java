package Loops.forloop;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {

		// we have to count digit in a number with for loop.

		Scanner sc = new Scanner(System.in);

		System.out.println("enter input here : ");
		int n = sc.nextInt();

		int count = 0; // initiate count first

		for (int i = 0; n != 0; count++) { //then input is not zero and count ++ for run loop of count which we have to print

			n = n / 10;              //means if input is divide as per their digit

		}
		System.out.println(count);

	}

}
