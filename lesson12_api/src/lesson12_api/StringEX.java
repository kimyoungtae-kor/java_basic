package lesson12_api;

import java.util.Arrays;

public class StringEX {
	public static void main(String[] args) {
		String str = "abcdeabcde";
		
		System.out.println(str.charAt(3));
	//	System.out.println(str.charAt(100));
		System.out.println(str.equals(new String("abcdeabcde")));
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b",3));
		System.out.println(str.lastIndexOf("b",3));

		System.out.println(str.substring(3));
		System.out.println(str.substring(0,4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		
		System.out.println(str.indexOf("c"));
		System.out.println(str.lastIndexOf("c"));
		int aaa = str.indexOf("c");
		int bbb = str.lastIndexOf("d");
		
		System.out.println(str.substring(aaa,bbb));
		
		System.out.println(str.toUpperCase().toLowerCase());
		String s = "     [ 안녕하세요  ]    ";
		System.out.println(s.trim().replaceAll(" ", ""));
		
		System.out.println(str.endsWith("de"));
		System.out.println(str.endsWith("cd"));
		System.out.println(str.indexOf("cdea"));
		
		System.out.println(str.replace("a", "f"));
		System.out.println(str.replaceFirst("a", "f"));
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));
		System.out.println(str.split("b"));
		
		System.out.println("abc".compareTo("a박e"));
		
	}
}
