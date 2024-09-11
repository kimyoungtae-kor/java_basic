package lesson_11_exception;

public class ExceptionEx3 {
	public static void main(String[] args) {
		System.out.println("전");
		m1();
		
		System.out.println("후");
	}
	static void m1() {
			try {
				m2();	
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic 예외처리");
			}
			System.out.println("m2(전)");
		
		}
	static void m2() {
		System.out.println("m2전");
		try {
			m3();	
		}catch (IndexOutOfBoundsException e) {
			System.out.println("index 예외 처리");
		}
		finally {
			System.out.println("m2후");	
		}
		
	}
	static void m3() {
		System.out.println(3/0);
	}
}
