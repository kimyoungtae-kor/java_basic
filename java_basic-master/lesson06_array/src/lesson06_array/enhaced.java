package lesson06_array;

import java.util.Arrays;

public class enhaced {
	public static void main(String[] args) {
		int[] arr = {10,15,5,20,30};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println(Arrays.toString(arr));
		String[] strs = {"더조은","아카데미","자바","데이터베이스"};
		
		for(String aaa : strs) {
			System.out.print(aaa );
		}
		
		
		//향상된 for 문
		//1. 인덱스 x
		//2. 읽기 전용
		//3. 
	}
}
