package Loops.forloop;

import java.util.Scanner;

public class reversedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a program to reverse the given Digits.

		// firstly we have to take input from user so we import scanner.
		Scanner sc = new Scanner(System.in);

		System.err.println("please enter number :");
		int input = sc.nextInt();

		// we take a random variable as zero in it
		int result = 0;

		// i=0-loop will run from zero.

		for (int i = 0; input > 0; i++) {

			// input%10 means each time the loop will run he cutoff the last digit of input
			int last = input % 10;
			
			//if input is 1234 the 0*10+1234= 4
			result = result * 10 + last;
		// in second loop it will give value without 4
			input = input / 10;
		}
		System.out.println(result);

	}

}
