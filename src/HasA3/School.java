package HasA3;

public class School {
	private String schoolname;
	private String schooltype;
	private String schooldiv;
	private Teacher teacher;
	private Student student;

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getSchooltype() {
		return schooltype;
	}

	public void setSchooltype(String schooltype) {
		this.schooltype = schooltype;
	}

	public String getSchooldiv() {
		return schooldiv;
	}

	public void setSchooldiv(String schooldiv) {
		this.schooldiv = schooldiv;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
