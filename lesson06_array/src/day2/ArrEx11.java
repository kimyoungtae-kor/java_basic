package day2;

public class ArrEx11 {
	public static void main(String[] args) {
//		int[][][] arrint = new int[3][3][3];
//		
//		int value =0;
//		for(int i=0; i<=2; i++) {
//			for (int j=0;j<=2;j++) {
//				for (int k =0;k<=2; k++) {
//					arrint[i][j][k] =value++;
//				}
//			}
//		}
//		
//		for(int arr1[][]: arrint) {
//			for(int arr[] : arr1) {
//				for(int ar : arr) {
//					System.out.printf("%4d",ar);
//				}
//				System.out.println();
//			}
//
//		}
//		
		String[][] addrs = {
				{"홍길동","고길동"},
				{"서울","제주"},
				{"0001","0002","0003"}
				
		};
		
		for(int i =0;i < addrs.length;i++) {
			for(int j = 0 ; j<addrs[i].length;j++) {
				System.out.print(addrs[i][j] + " ");
			}
			System.out.println();
		}
		
//		for(String addr[]:addrs) {
//			for(String add:addr) {
//				
//			}
//		}
		
//		int[][] arr = new int[3][2];
//		arr[0] = new int[] {1,2,3,4};
//		arr[1] = new int[2];
//		arr[2] = null;
//		String str =null;
//		System.out.println(arr.length);
	}
}
