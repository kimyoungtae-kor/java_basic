package lesson06_array;

public class array {
	public static void main(String[] args) {
		// 배열 : 하나의 변수로 여러데이터를 저장
		// 타입 변수명; //타입[] 변수명;
		
		int[] arr = new int[5];//int 배열 초기화
		
		double[] arr2; 
		
		String[] strings;
		
		//String str = null; string 초기화값
		
		int[] arr3;
		arr3 = new int [5];
		arr3[0] = 10;
		arr3[1] = 30;
		arr3[3] = 50;
		for(int i =0 ;i <arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		//값을 통한 초기화
		String[] strs = {"홍길동","이순신","김유신","김용태","let's go"};
		System.out.println(strs[1]);
		
		for(int i= 0;i < strs.length ;i++) {
			System.out.println(strs[i]);
		}
		System.out.println(strs.length);
	}
}
