package day2;

import java.util.Arrays;

public class Exer {
	public static void main(String[] args) {
		//버블 정렬
		//int [] arr1 = {2,1,10,7,5};
		int [] arr1 = {2,1,10,7,5,7,3,11,4};
		System.out.println("초기 ::" + Arrays.toString(arr1));
		//회차 반복
		//비교 반복
		//값 비교 자리 교환
		for(int i=0;i<arr1.length -1;i++) {
			for(int j=0;j<arr1.length-1 -i;j++) {
				if(arr1[j] > arr1[j+1]) {
					int tmp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = tmp;
				}
			}
			System.out.println(i + 1 + "회차" + Arrays.toString(arr1));
			
		}
		System.out.println(Arrays.toString(arr1));
	}
}
