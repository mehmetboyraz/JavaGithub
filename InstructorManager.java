package odevDersUc;

public class InstructorManager {
	
	public void add(Instructor ýnstructor){
		System.out.println("Eðitmen eklendi : "+ ýnstructor.name);
	};

	public void update(Instructor ýnstructor) {
		System.out.println("Eðitmen güncellendi : "+ ýnstructor.name);
	};

	public void delete(Instructor ýnstructor) {
		System.out.println("Eðitmen silindi"+ ýnstructor.name);
	};

}

