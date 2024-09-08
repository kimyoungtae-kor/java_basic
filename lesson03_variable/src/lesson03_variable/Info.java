package lesson03_variable;

public class Info {

	public static void main(String[] args) {
		String s =Integer.toBinaryString(10);
		String s2 =Integer.toBinaryString(6);
		System.out.println(s);
		System.out.println(s2);
		System.out.printf("%032d\n",Integer.parseInt(s2));
		String s3 =Integer.toBinaryString(-23);
		System.out.println(s3);
		
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("0" +Integer.toBinaryString(max));
		System.out.println(Integer.toBinaryString(min));
		
		
	}

}
