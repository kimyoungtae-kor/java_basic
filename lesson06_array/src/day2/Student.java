package day2;

public class Student {
	// 생성자의 첫줄 super(arg),혹은this(arg)
		int no;
		String name;
		
		Student() {
			
		}
		Student(int i, String s){
			this(s);
			no = i;
			
		}
		Student(String s,int i){
			name = s;
			no = 4;
		}
		Student(String s){
			name =s;
		}
		
		void printThis() {
			System.out.println(this);
		}
		
		Student retrunThis() {
			return this;
		}
		
		


}
