package day2;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.no = 20;
		s.name ="새똥이";
		Student s3 = new Student("r");
		
		System.out.println(s3.name);
		Student s2 = new Student(10, "길동이");
		System.out.println(s2.name);
		System.out.println(s.name);
		System.out.println(s2.no);
		System.out.println(s.no);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		s2.printThis();
		
		System.out.println(s.retrunThis().retrunThis().retrunThis().retrunThis().retrunThis());
	}
}
