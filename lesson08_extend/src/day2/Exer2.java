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
		
		
		for(int i=0;i <counts.length;i++) {
				System.out.printf("%d원 짜리가 %d" +(units[i] >= 1000?"장":"개") + "\n",units[i],counts[i]);

		}
		
//		for(int arr:counts) {
//			System.out.printf("%d원 짜리가 %d" +(units[arr] >= 1000?"장":"개") + "\n",counts,arr);
//			System.out.print(arr + " ");
//		}
		//{2,2,0,3,4,1,0,1,1}
		
		//2. Scanner 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람이름들을 문자열 배열 만들어서
		//프로그램 종료직전 확인
		
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);


		String [] namearr = new String[3];
		
		int i = 0;
		while(true) {
			System.out.print("이름을입력해주세요");
			String name = scanner.nextLine();
			
			if(name.equals("q")) {
				System.out.println("종료합니다");
				break;
			}
			
//			String [] namearr2 = new String[i+1];
			
			if(namearr.length == i) {
				System.out.println("문제발생직전");
				namearr = Arrays.copyOf(namearr,namearr.length * 2);
			}
//			for(int j=0;j<i;j++) {
//				namearr2[j] = namearr[j];
//			}
			
			namearr[i] = name;
			
//			namearr = namearr2;
			i++;
			
			
			
		}
		for(String s : namearr) {
			if(s == null)break;
			System.out.println(s);
		}
		}
	}
