package lesson_11_exception;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;

public class ExceptionEX05 {
	public static void main(String[] args)  {
		
		//check exception : 일반 예외
		// unchecked exception : 런타임 예외
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("가능");
	}
	
	static void  m1() throws Exception {
		Exception ex = new Exception();
		throw ex;
	}
}
class A {
	void m() throws IOException{
		
	}
}
class B extends A {

	@Override
	public void m() throws MalformedURLException {
		
	}
	
}