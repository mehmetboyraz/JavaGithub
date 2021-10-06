package odevDersUc;

public class Instructor extends User {
	String profession;

	public Instructor(int id, String name, String lastName, int age,
			String userName, String password,String profession) {
		super(id, name, lastName, age, userName, password);
		this.profession = profession;
	}
	

	




}
