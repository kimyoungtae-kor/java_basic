package lesson_11_exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			Integer.parseInt("a");
			System.out.println(args[0]);
			System.out.println(4/0);


	
		}catch(ArithmeticException e){
			System.out.println(5);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(6);
		}catch (Exception e) {
			System.out.println("최후의 처리");
//			e.printStackTrace();
			System.err.println(e.getClass().getName());;
			System.err.println(e.getMessage());
		StackTraceElement[] elements =e.getStackTrace();
		for(StackTraceElement ste : elements) {
			 System.out.println(ste.getMethodName()); 
		}
		}
		
		System.out.println(7);
	}
}
