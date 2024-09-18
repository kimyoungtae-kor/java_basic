package lesson12_api.re;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b[a-z]*");
		Matcher m;
		
		m = pattern.matcher("bat");
		System.out.println("bat = "+m.matches());
		m = pattern.matcher("cat");
		System.out.println("cat = "+m.matches());
		m = pattern.matcher("bed");
		System.out.println("bed = "+m.matches());
		m = pattern.matcher("add");
		System.out.println("add = "+m.matches());
		
		String emailRegex = "^[a-zA-Z0-9.%+-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,}$"; //^문자열 시작 $ 문자열끝 \\탈출
		
		System.out.println("bat".matches("b[a-z]*"));
		
		
		int[] arr = new int [5];
		arr[0] = 1;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
	}
}
