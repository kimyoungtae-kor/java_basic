package lesson05_control;

public class WhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			System.out.printf("i: %d sum: %d\n",i,sum );
			i++;
		}
		System.out.println("합계 :" + sum);
		
		// 정수를 입력받아 각 자릿수의 합계를 구하여라.
		
		int num = 123456; // 12
		int res = num%10;
		sum = 0;
		
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
		
//		for(int y=1;y <=6 ; y++ ) {
//			sum += num % 10;
//			num /=10;
//		}
		
		for( ;num != 0;num /= 10) {
			sum += num % 10;
		}
		System.out.println(sum);
//		System.out.println(res);
//		sum += num % 10;
//		num /= 10;
//		System.out.println(num);
//		sum += num % 10;
//		num /= 10;
//		sum += num %10; //1+2+3 = 6
//		num /= 10;
//		
//		sum += num %10; // 1+2+3+3 =9
//		num /= 10;
//		
//		sum += num %10; // 1+2+3+3+2 =11
//		num /= 10;
//		
//		sum += num %10; // 1+2+3+3+2+1 =12
		System.out.println(sum);
	}
}
