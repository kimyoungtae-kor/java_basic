package lesson03_variable;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 >");
		String name = scanner.nextLine();
		System.out.println("국어점수를 입력하세요 >");
		int kor = scanner.nextInt();

		System.out.println("영어점수를 입력하세요 >");
		int eng = scanner.nextInt();

		System.out.println("수학점수를 입력하세요 >");
		int mat = scanner.nextInt();
		
		
		//총점
		int total = kor + eng + mat;
//		total += name + kor + eng + mat;
		//평균
//		System.out.println((int)(pi * 1000 + 0.5) / 1000d)
		double avg =(int)(total /3d * 100 + 0.5) / 100d;
		
		System.out.println(avg);
		
		
		
		
		System.out.println("==================================");
		System.out.println("이름 국어 영어 수학 총점 평균");

		System.out.println("==================================");
		System.out.printf("%6s %6d %6d %6d %6d %6f",name,kor,eng,mat,total,avg);
	}
}
