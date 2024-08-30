package lesson03_variable;

public class overflow {
	public static void main(String[] args) {
		//형변환
		byte b = Byte.MAX_VALUE;
		byte b1 =1;
		byte b2 = (byte)(b +b1);//126
		System.out.println(b2);
		int i = 300;
		byte b3 = (byte)i;
		System.out.println(i);
		System.out.println(b3);
		
		System.out.println(Integer.toBinaryString(i));
		// 1 0010 1100
		
		System.out.println((char)('가'+1));
		
		System.out.println('9' - '0' + 1);
		System.out.println('Z' - 'A' + 1);
		System.out.println('힣' - '가' + 1);
		System.out.println("====================================");
		int cnt = 0;
		for(char ch = '가';ch <= '힣';ch++) {
//			System.out.print(ch);
			cnt++;
		}
		System.out.println(cnt);
		
////		int apple = 123;
////		int box = 10;
////		int bbb = apple/box ? ; //12
////		String ccc = ""+bbb; //"12";
////		int aaa = apple%box; //3.0
////		String fff = ""+aaa; //"3"
////		System.out.println(ccc + "." +aaa);
//		
//		
////		
//		int apple = 123;
//		int box = 10;
//		int res = apple%box == 0 ? apple / box : apple /box +1;
//		int res = (apple+9)/box;
//		System.out.println(res);
//		
////		int apple = 123;
////		int box = 10;
////		if(apple % box != 0) {
////			box = apple /box;
////			++box;
////		}
////		System.out.println(box);
//		
		double pi = 3.141592;
		System.out.println(pi * 1000);//3141
		System.out.println((int)(pi * 1000 + 0.5) / 1000d);
		
		
		
	}

}
