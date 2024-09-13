package lesson06_array;

public class printfloat {
	public static void main(String[] args) {
		int num =10;
		boolean flag = true;
		for(int i = 2; i< num ; i++) {
			if(num %i ==0) {
				flag = false;
				break;
			}

		}
		System.out.println(flag ? "소수" : "소수아님"); 
	}
}
