package odevDersUc;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor1= new Instructor(1,"Engin","Demiroğ",33,
				"EnginHoca","******","java+react");
		System.out.println(ınstructor1.userName);
		
		Student student1 = new Student (1,"Mehmet","Boyraz",23,"MehmetBoy","*****","Java+react");
		System.out.println(student1.userName);
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add(student1);
		InstructorManager ınstructormanager = new InstructorManager();
		ınstructormanager.add(ınstructor1);
	}

}
