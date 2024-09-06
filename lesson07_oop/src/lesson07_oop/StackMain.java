package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		MyStack ms = new MyStack();
		for(int i=0;i<100000;i++) {
			stack.push("±è¿ëÅÂ");	
		}
		
		stack.push("Àß»ý±è");
		stack.push("¿¡¾îÄÁ");
		System.out.println(stack.size());
	
	}
}
