
public class Student extends User {
	
	private String studentNumber;
	private String department;
	
	public Student() {
		
	}

	public Student(int id,String firstName,String lastName,String email,String studentNumber, String department) {
		
		this.studentNumber = studentNumber;
		this.department = department;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	
}
