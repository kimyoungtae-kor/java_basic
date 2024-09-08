package lesson05_control;

public class IFex {
	public static void main(String[] args) {
		
		double rand = Math.random(); 
		
		int score = (int)(rand * 101);//101인이유 : 필요함 경우의수 +1
		System.out.println(score);
//		int score = 70;
		System.out.println("시험시작");
		if(score >= 60) {
			System.out.println("합격입니다");
		}
		System.out.println("시험 끝");
		
		
	}
}
