
public class StudentManager extends UserManager {
	
	public void addDepartment(Student student) {
		System.out.println(student.getFirstName() + " ��renci/" + student.getDepartment() + "  Deparman�na eklenmi�tir." );
	}

}
