package day2.singleton;

public class SingletonTest {
	//final : 클래스,메서드,필드
			//스트링 에는 x
	//메서드에붙으면 오버라이딩 X
	final int i;
	public SingletonTest(int i){
		this.i = i;
	}
	public static void main(String[] args) {
		String str;
		
		

//		Singleton singleton = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//회원
		//책
		// 구매
	}
}
