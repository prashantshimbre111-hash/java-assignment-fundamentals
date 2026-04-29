package Loops.forloop;

import java.util.Scanner;

public class Cubewithinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number here");
		int n = sc.nextInt();
		
		for (int i = 1 ; i<=n ; i++) {
			
			int cube = i*i*i;
			
			System.out.println("cube of " + i + ": " +  cube);
		}

	}

}
