package HasA2;

public class Test {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.setParentname("Nandkishor Patil");
		p.setContactno("9422449598");
		p.setAddress("Buldhana");
		
		Student s = new Student();
		s.setId("1001");
		s.setName("Prashant Patil");
		s.setStanderd("10th");
		s.setDiv("A");
		s.setParent(p);
		
		Teacher t = new Teacher();
		t.setTname("Mr. Avdhoot Rane");
		t.setEducation("d.Ed");
		t.setTsubject("math");
		t.setStudent(s);
		
		System.out.println(t.getTname());
		System.out.println(t.getEducation());
		System.out.println(t.getTsubject());
		System.out.println(t.getStudent().getName());
		System.out.println(t.getStudent().getId());
		System.out.println(t.getStudent().getStanderd());
		System.out.println(t.getStudent().getDiv());
		System.out.println(t.getStudent().getParent().getParentname());
		System.out.println(t.getStudent().getParent().getContactno());
		System.out.println(t.getStudent().getParent().getAddress());
		
		
	}

}
