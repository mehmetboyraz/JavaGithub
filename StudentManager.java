package odevDersUc;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Yeni ��renci eklendi : "+ student.name);
	};

	public void update(Student student) {
		System.out.println("��renci g�ncellendi : "+ student.name);
	};
	public void delete(Student student) {
		System.out.println("��renci silindi : "+ student.name);
	};
}

