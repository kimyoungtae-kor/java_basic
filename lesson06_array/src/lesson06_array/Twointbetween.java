package lesson06_array;

import java.util.Arrays;
import java.util.Scanner;

public class Twointbetween {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 정수를 입력해주세요");
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		int sum =0;
		System.out.println("=====================");
		
		//if(int1 > int2){
		// int tmp =int1;
		//	int1 = int2;
		// int2=tmp;
		//
		//}
		
		if(int1 > int2) {
			for(int i=int2;i<=int1;i++) {
				sum +=i;
			}
		}else {
			for(int i=int1;i<=int2;i++) {
				sum +=i;
			}
		}
		
		
		System.out.println(sum);
		}
}
