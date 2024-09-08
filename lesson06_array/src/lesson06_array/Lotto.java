package lesson06_array;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		//1~45 
		
		int[] lotto = new int[7]; //[0,0,0,0,0,0]
		
		int idx = 0;
		while(true) {
			int number = (int)(Math.random()*45)+1 ;//45가지 경우의수 0을없애기위한 +1 과 0~44
			boolean insert =true;
			for (int i=0; i<=idx; i++) {
				if(lotto[i] ==number) {
					insert = false; //insert = false로써 밑에 if문 통과
					break; //이 if문에서 나감
				}
			}
			if (insert == true) {
				lotto[idx] = number; //배열에 난수입력
				idx++;
			}
			if (idx == 7) {
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
