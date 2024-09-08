package lesson07_oop;

import java.util.Arrays;

public class selection {
	public static void main(String[] args) {
		int[]arr = {7,8,9,10,11};
		int min = 0;
		// 회 차 반복문
		//최소값 찾기 반복문내부
		// - 최소값이 존재하는 인덱스
		// - 0번째 위치의 값이 위 인덱스에 있던값과 교환
//		for(int i = 0;i<arr.length - 1;i++) {
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[min]>arr[j]) {
//					min = j;
//					
//				}
//			}
//			int tmp = arr[min];
//			arr[min] = arr[i];
//			arr[i] = tmp;
//
//		}
			for(int i = 0 ; i <arr.length;i++) {
			int idx = i;
			for(int j = i; j < arr.length ; j++) {
				if(arr[idx]>arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i]; // {5,4,2,5,7}
			arr[i] = tmp; //{1,4,2,5,7}
			System.out.println(Arrays.toString(arr));
			}		
	

	}
}
