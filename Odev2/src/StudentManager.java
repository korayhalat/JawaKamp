
public class StudentManager extends UserManager {
	
	public void addDepartment(Student student) {
		System.out.println(student.getFirstName() + " öğrenci/" + student.getDepartment() + "  Deparmanına eklenmiştir." );
	}

}
