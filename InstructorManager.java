package odevDersUc;

public class InstructorManager {
	
	public void add(Instructor �nstructor){
		System.out.println("E�itmen eklendi : "+ �nstructor.name);
	};

	public void update(Instructor �nstructor) {
		System.out.println("E�itmen g�ncellendi : "+ �nstructor.name);
	};

	public void delete(Instructor �nstructor) {
		System.out.println("E�itmen silindi"+ �nstructor.name);
	};

}

