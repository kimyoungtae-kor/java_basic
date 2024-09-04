package lesson07_oop;

public class MemberMain {
	//필드공간
	

	public static void main(String[] args) {
		//메인메서드공간
		Member m = new Member(); //객체 생성
		m.aaa = "10살이얌";
		m.kor = 90;
		m.eng = 75;
		m.mat = 60;
		System.out.println(m.total());
		Member m2 = new Member();//객체 생성
		Member m3 = m; //m과 같은객체
		System.out.println(m.aaa);
		m2.kor = 50;
		m2.eng = 75;
		m2.mat = 60;
		System.out.println(m2.total());
//인스턴스객체? 독립되고 개별된 객체 new 는 인스턴스륽객체를 생성하는 키워드이다
//글로벌 객체? 모든영역을 가진 객체
// 클래스,인터페이스,배열 타입
//객체명(변수명) = new Member() : 
		if(m == m3) {
			System.out.println("m ,m2는 같은 객체");
		}else {
			System.out.println("m,m2는 다른객체");
		}
		
		MemberMain mm = new MemberMain();
		MemberMain mm2 = new MemberMain();
	}

}
