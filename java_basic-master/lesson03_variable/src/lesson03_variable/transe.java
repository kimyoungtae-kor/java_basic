package lesson03_variable;

public class transe {
	public static void main(String[] args) {
		int num =10;
		String s = num + "";
		System.out.println(s);
		
		int num2 = Integer.parseInt(s);
		System.out.println(num2);
		int num3 = Integer.parseInt("1234");
		System.out.println(num3 % 10);
		
		String bin = "11010";
		int num4 = Integer.parseInt(bin, 2);
		System.out.println(num4);
		
	}
}
