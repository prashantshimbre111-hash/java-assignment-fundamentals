package Array;

public class Tsetarray {
	
	public static void main(String[] prashant) {
		
		int[] s = {15 ,  20 , 25 , 30 , 35, 40 , 45 , 50 , 55 , 60 };
		
		System.out.println(s[0]);
		System.out.println(s[4]);
		System.out.println();
		
//		for (int i = 0 ; i <= s.length-1 ; i++) {
//			
//			System.out.println(s[i]);
//			
//		}
		for(int i = 0 ; i<=s.length-1 ; i++) {
			
			
			
			if(s[i]%2==1) {
				
				System.out.println(s[i]);
			}
		}
		
	}

}
