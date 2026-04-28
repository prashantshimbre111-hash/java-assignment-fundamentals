package Loops.forloop;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				System.out.println("please enter number");
			int input  = sc.nextInt();
			
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println(i*input);
		}

	}

}
