package HasA3;

public class Test {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setSname("prashant shibmare");
		s.setSid("101");
		s.setStd("10th standerd");
		
		Teacher t = new Teacher();
		t.setTname("Mr. Avdhoot Rane");
		t.setTeducation("MA math");
		t.setTsubject("math");
		
		School s1 = new School();
		s1.setSchoolname("MES Education Soc.");
		s1.setSchooltype("secondary and higher secondary school");
		s1.setSchooldiv("1st to 12th");
		s1.setTeacher(t);
		s1.setStudent(s);
		
		
		System.out.println(s1.getSchoolname());
		System.out.println(s1.getSchooltype());
		System.out.println(s1.getSchooldiv());
		System.out.println(s1.getTeacher().getTname());
		System.out.println(s1.getTeacher().getTeducation());
		System.out.println(s1.getTeacher().getTsubject());
		System.out.println(s1.getStudent().getSname());
		System.out.println(s1.getStudent().getSid());
		System.out.println(s1.getStudent().getStd());
	}

}
