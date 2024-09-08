package lesson07_oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// 작은 인덱스에서부터 시작 (회차)
		// 현재 위치의 인덱스 미만의 값들과 대소 비교 (Array copy가 편함)
		// 내가 더작다면 해당위치의 삽입 예정
		// 나 위치에서 부터 한칸씩 우측이동
		// 예정위치에 해당값 대입
		
		//검색하고 코드랑 디버깅해보면서 해석,수정은했는데.. 식은못만들었어요....
//		int[] arr = {6,5,3,1,8,7,2,4};
//        for (int i = 1; i < arr.length; i++) {
//            int tmp = arr[i]; //5,3
//            int j;
//            for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
//                arr[j + 1] = arr[j]; //1회차:0번째인덱스 즉 6을 1번인덱스에복사 ->
//                //2회차:1번째인덱스 즉 6을 2번째인덱스에복사
//                //3회차:2번재인덱스 즉 6을 3번째인덱스에 복사
//            }
//            arr[j + 1] = tmp;
//            //0번째인덱스 = 5 ->1번째 6 -> 2번째  3 ->0번째  오른쪽이동>> 이후 반복
//        }
//
//        System.out.println(Arrays.toString(arr));
//	
		
		int[] arr= {1,5,4,2,6};
		//3번인덱스의값을 1값을
		//맨앞으로 보내기
		// {3,5,4,1,2,}
		// {3,5,1,4,2}
		// {3,1,5,4,2}
		

		for(int j = 1;j <arr.length;j++) {
			System.out.println(j+"회차");
		
			for(int i = 4 ; i>0;i--) {
				if(arr[i]<arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		

	}
}
