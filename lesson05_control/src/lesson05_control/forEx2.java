package lesson05_control;

public class forEx2 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i = 1 ; i <= 100;i++) {
			sum += i;
			System.out.printf("i : %d sum : %d\n",);
		}
		System.out.println(sum);
		
		for(int x = 2; x <= 10; x++) {
			for(int y = 1; y<=10; y++) {
				System.out.println(x + "x"+ y + "="+x*y);
			}
		}
	}
}
