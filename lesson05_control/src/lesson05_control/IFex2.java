package lesson05_control;

import java.util.Random;

public class IFex2 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 101);
		System.out.println(score);
		String grad = "";
		System.out.println("학점부여 시작");
		if(score >= 90) {
			grad = "A";
		}else if(score <=89 && score >= 80) {
			grad = "B";
		}else if(score <=79 && score >= 70) {
			grad = "C";
		}else if(score <=69 && score >= 60) {
			grad = "D";
		}else if(score <=59 && score >= 50) {
			grad = "E";
		}else {
			grad = "F";
		}
		
		if(score >= 80 && score % 10 >=5 || score ==100) {
			grad +="+";
		}
		System.out.println("당신의 학점은:"+grad);
	}

}
