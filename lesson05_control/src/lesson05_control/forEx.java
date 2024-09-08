package lesson05_control;

public class forEx {
	public static void main(String[] args) {
		
		int y = 1;
		int sum = 0;
		for(int i =0; i<10; i++) {
			System.out.println("i ="+i);
		}
		while(y<10) {
			System.out.println("y = "+y);
			y++;
			sum += y;
		}
		System.out.println("sum = "+sum);
		
	}
}
