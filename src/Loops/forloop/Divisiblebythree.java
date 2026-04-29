package Loops.forloop;

public class Divisiblebythree {
	
	//Print all numbers divisible by 3 between 1 and 30
	
	public static void main(String[] args) {
		
		for (int i = 1 ; i <=30 ; i++) {
			
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}

}
