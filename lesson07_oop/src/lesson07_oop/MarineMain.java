package lesson07_oop;

public class MarineMain {
	public static void main(String[] args) {
		Marine marine = new Marine();
		System.out.println(marine.hp);
		marine.hp -= 5*6;
		System.out.println(marine.hp);
		
		Marine.att++;
		System.out.println(marine.att);
		
		
		Member member = new Member();

		
	}
	
}
