package lesson05_control;

public class mypratice {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=100;i ++) {
			if(i % 5 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i =1 ;i<=100;i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		System.out.println("even:"+evenSum+" odd: "+oddSum);
		
		for(int x=1;x<=6;x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.println("x = "+x+"y = "+y);
				}
			}
		}
		
	}
}
