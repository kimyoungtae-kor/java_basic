package lesson06_array;

import java.util.Arrays;

public class info2 {
	public static void main(String[] args) {
		int[] arr = {10,5,3,8,4};
		arr = new int [10];
		arr = new int[]{1,2,3,5,6,7,8,9,10,11,12,13,14};
		System.out.println(arr.length);
		
		char[] cArr = {'A','B','가','나'};
		System.out.println(cArr);
		
		String[] strArr = {"가나","다라"};
		System.out.println(strArr);
		
		System.out.println(Arrays.toString(cArr));
	}
}
