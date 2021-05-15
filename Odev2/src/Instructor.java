
public class Instructor extends User {
	
	private String title;
	private String[] courseList;
	
	public Instructor(int id,String firstName, String lastName,String email,String title, String[] courseList) {
		
		this.title = title;
		this.courseList = courseList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getCourseList() {
		return courseList;
	}

	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}	
	

}
