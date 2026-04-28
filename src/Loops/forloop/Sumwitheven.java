package Loops.forloop;

import java.util.Scanner;

public class Sumwitheven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number here : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 2; i <= n; i += 2) {
			sum += i;

		}
		System.out.println(sum);

	}

}
