package assignments.java_practice.ifelseassg;

public class Agecatagory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int human = 14;
		
		if(human<=12) {
			System.out.println("child");
		}
		else if(human<=17) {
			System.out.println("teen");
		}
		else if(human<=59) {
			System.out.println("adult");
		}
		else if(human>60) {
			System.out.println("senior");
		}
	}

}
