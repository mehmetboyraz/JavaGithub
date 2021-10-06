package odevDersUc;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Yeni öğrenci eklendi : "+ student.name);
	};

	public void update(Student student) {
		System.out.println("Öğrenci güncellendi : "+ student.name);
	};
	public void delete(Student student) {
		System.out.println("Öğrenci silindi : "+ student.name);
	};
}

