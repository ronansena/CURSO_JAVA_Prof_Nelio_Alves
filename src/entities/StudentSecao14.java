package entities;

public class StudentSecao14  {
	
	private Integer codStudent;
	private String course;
	
	public StudentSecao14(Integer codStudent, String course) {
		this.codStudent = codStudent;
		this.course = course;
	}
	public Integer getCodStudent() {
		return codStudent;
	}
	public void setCodStudent(Integer codStudent) {
		this.codStudent = codStudent;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codStudent == null) ? 0 : codStudent.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSecao14 other = (StudentSecao14) obj;
		if (codStudent == null) {
			if (other.codStudent != null)
				return false;
		} else if (!codStudent.equals(other.codStudent))
			return false;
		return true;
	}
}
