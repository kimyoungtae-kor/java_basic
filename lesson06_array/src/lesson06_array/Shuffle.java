package lesson06_array;

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
//		int[] arr = {10,20,30,40,50};
//		
//		System.out.println(Arrays.toString(arr));
//		int tmp =arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
//		System.out.println(Arrays.toString(arr));
//		int rand=(int)(Math.random() *5);
//		arr[0] = arr[rand];
//		arr[rand] = tmp;
		
		int[] arr = new int[50];
		for(int i=0;i<arr.length;i++) {
			arr[i] =i +1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i =0;i<arr.length ;i++) {
			int rand=(int)(Math.random() *arr.length);
			int tmp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = tmp;
		}
		//6개만 가져오기
		int[] lotto = new int[6];
		for(int i =0;i<lotto.length;i++) {
			lotto[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(lotto));
	}
}
