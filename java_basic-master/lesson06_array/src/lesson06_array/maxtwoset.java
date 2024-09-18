package lesson06_array;

import java.util.Scanner;

public class maxtwoset {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("두 정수를 입력해주세요");
//		int int1 = scanner.nextInt();
//		int int2 = scanner.nextInt();
//		int num1 = 12;
//		int num2 = 18;
//		int result = 0;
//		for(int i = 1; i <= num1 ; i++) {
//			for(int j = 1; j <= num2 ; j++) {
//				if(num2 % j == 0 && num1 % i == 0 && i ==j) {
//
//					result = i;
//					
//				}
//			}
//		}
//		System.out.println(result);
		
		// 12 18 12
		//    18  12 6
		//		 12  6 0
		
		//145 15 10
		//     15  10  5
		//        10  5  0
		int num1 = 12;
		int num2 = 18;
		int result = 0;
		boolean flag = true;
		while(flag) {
			int tmp = num1% num2;
//			System.out.printf("%d %d %\n", num1,num2,tmp);
			num1 = num2;
			num2 = tmp;
			if(tmp == 0) {
				flag = false;
				System.out.println(num1);
			}
		}
		
		num1 = 12;
		num2 = 18;
		outer:
		for(int i = num1 ; i<= num1 * num2; i+= num1) {
			for(int j = num2 ; j<= num1 * num2; j+= num2) {
				if(i ==j) {
				System.out.println(j);
				break outer;
				}
			}
		}
	}
}
