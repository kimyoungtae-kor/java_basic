package lesson03_variable;

public class pratice {
 public static void main(String[] args) {
	 // += : 우측항의 값을 좌항값에 더하여 좌항에 대입
	 // -= : 우측항의 값을 좌항값에 빼고 좌항에 대입
	 // %= : '' 나머지 계산
	
	int colorPen = 5 * 12;
	int student = 27;
	int divColorPen = colorPen/student;
	System.out.println(divColorPen);
	System.out.println( colorPen % student);
	
	int age = 8;
	int key = 120;
	boolean parent = true;
	boolean hearch = false;
	
	if(age >=6 &&key >=120 && parent ==true && hearch == false) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
//	boolean res = (age>=6 && key >=120) || (key >= 120 && parent == true && hearch == false) ?true:false;
	boolean res = key >=120 && (age >=6 ||parent) && hearch == false;
	System.out.println(res);
	
	
	int year = 2020;
	boolean leapYear = year%4==0 && year % 100 !=0 || year % 400 ==0;
	System.out.println(year);
	
	
	int price = 187000;
	int oman = 187000 / 50000;
	System.out.println("oman :"+oman);
	int ilman = price % 50000 /10000;
	System.out.println("일만:"+ ilman);
	int ochun = price % 50000 % 10000 / 5000;
	System.out.println(ochun);
	int ilchun = price % 50000 % 10000 % 5000 /1000;
	System.out.println(ilchun);
	
	
	int number = 1234;
	int result = (number / 100) * 100;
	System.out.println(result);
	
	
 }
}
