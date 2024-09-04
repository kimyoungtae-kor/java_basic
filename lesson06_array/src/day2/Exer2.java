package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {	
		//지폐,동전 세기
		int money = 123456;
		int [] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int [] counts = new int[10];
		
		for(int i =0 ; i<units.length;i++) {
			
			counts[i] = money/units[i];
			money = money % units[i];
		}
		
		for(int arr:counts) {
			System.out.print(arr + " ");
		}
		//{2,2,0,3,4,1,0,1,1}
		
		//2. Scanner 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람이름들을 문자열 배열 만들어서
		//프로그램 종료직전 확인
		
		Scanner scanner = new Scanner(System.in);


		String [] namearr = new String[3];
		
		int i = 1;
		while(true) {
			String name = scanner.nextLine();
			namearr = new String[i];
			namearr[i] = name;
			String [] namearr2 = new String[i];
			namearr2[i] = namearr[i];
			i++;
			
//			while(true) {
//				if(namearr[i] == "q") {
//					System.out.println("안녕히가세요");
//					break;
//				}else {
//					namearr[i] = name;
//
//				}
//			}
		
			
			
			
			
			
			System.out.println(name);
			System.out.println(Arrays.toString(namearr2));
		}
	}
}
