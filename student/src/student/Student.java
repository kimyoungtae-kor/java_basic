package student;


public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	int total() {
		return kor + eng + mat;
	}
	
	double avg() {
		return	total() / 3d;
	}
	
	//생성자 1개 이필드를싹다 사용하는
	
}
