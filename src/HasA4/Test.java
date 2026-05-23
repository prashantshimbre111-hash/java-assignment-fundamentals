package HasA4;

public class Test {
	
	public static void main(String [] args) {
		
		student s = new student();
		
		s.setStudentid("101");
		s.setStudentname("vishwanath");
		s.setStudentcourse("beginer to advance english speakig course");
		
		speakwell ss = new speakwell();
		ss.setAcademy("speakwell english speaking academy");
		ss.setGstno("12038264526");
		ss.setCourse("beginer to advance english speaking academy");
		ss.setAdd("karve nagar");
		ss.setSt(s);
		
		System.out.println(ss.getAcademy());
		System.out.println(ss.getAdd());
		System.out.println(ss.getGstno());
		System.out.println(ss.getCourse());
		System.out.println(ss.getSt().getStudentid());
		System.out.println(ss.getSt().getStudentcourse());
		System.out.println(ss.getSt().getStudentname());
		
	}
	

}
