package odevDersUc;

public class Student extends User {
	
	String courses;

	public Student(int id, String name, String lastName, int age, String userName, String password, String courses) {
		super(id, name, lastName, age, userName, password);
		this.courses = courses;
	}

}
