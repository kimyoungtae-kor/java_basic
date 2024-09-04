package lesson06_array;

import java.util.Arrays;

public class Arrex9 {
	public static void main(String[] args) {
		// 배열의 길이 늘리기
		
		
		
//		System.out.println("첫번째 값: " + args[0]);
//		System.out.println("두번째 값: "+args[1]);
		
		int[] arr = {1,2,3,4}; //4

		int[] arr2 = new int[arr.length * 2];

		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			//arr.length =5
			//i=0 i<=5 = 총 6번을 반복하기때문에 arr.length 오류가남 그래서 < 해줘야함
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		
		arr= arr2;
		System.out.println(arr2);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
}
