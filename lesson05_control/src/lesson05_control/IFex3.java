package lesson05_control;

public class IFex3 {
	// 자격증시험 ,과락 세과목 합격 불합격
	// 세과목 평균이 60이상이면 합격
	//단 개별과목이 40미만이면 불합격
	public static void main(String[] args) {
		
		int score1 = 60;
		int score2 = 90;
		int score3 = 49;
		
		int everage = (score1 + score2 + score3)/ 3;
		String res = "";
		System.out.println(everage);
		
		if(everage >=60 && (score1 >=40 && score2 >=40 && score3 >=40)) {
			res = "합격";

		}else {
			res = "불합격";
		}
		System.out.println(res);
	}

}
