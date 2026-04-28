package Loops.forloop;

import java.util.Scanner;

public class Sumwithforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number here : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum += i;

			
		}
		System.out.println(sum);
	}

}
