
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Koray");
		student.setLastName("Halat");
		student.setStudentNumber("123456");
		student.setDepartment("Yazılım Geliştirme");
		student.setEmail("koray@koray.com");
		
		
		String[] courseList = new String[] {"C#","Angular","React","Jawa"};
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ","engin@engin.com","Yönetici/eğitmen",courseList);
		
		User[] users = new User[] {student};
		
		UserManager userManager = new UserManager();
		for(User user : users) {
			userManager.add(user);
			userManager.getId(user);
		}
		userManager.add(instructor);
		userManager.getId(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addDepartment(student);
		
		

	}

}
