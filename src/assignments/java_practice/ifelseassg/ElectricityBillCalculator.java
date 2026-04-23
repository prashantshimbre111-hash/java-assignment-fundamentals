package assignments.java_practice.ifelseassg;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unit = 4301;
		
		if(unit <= 100) {
			System.out.println("5 rs/unit : " + (unit*5)) ;}
		else {
			if(unit <= 300) {
				System.out.println("7 rs/unit : " + (unit*7));}
			else {
				if (unit >=300) {
					System.out.println("10 rs/unit " + (unit*10));}
				}
			}
		}
		

	}


