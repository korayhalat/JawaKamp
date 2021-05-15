
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Koray");
		student.setLastName("Halat");
		student.setStudentNumber("123456");
		student.setDepartment("Yaz�l�m Geli�tirme");
		student.setEmail("koray@koray.com");
		
		
		String[] courseList = new String[] {"C#","Angular","React","Jawa"};
		
		Instructor instructor = new Instructor(1,"Engin","Demiro�","engin@engin.com","Y�netici/e�itmen",courseList);
		
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
