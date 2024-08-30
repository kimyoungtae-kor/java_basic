package lesson01_install;

import java.util.Scanner;
import java.time.LocalDate;
public class scan {
	public static void main(String[] args) {  
		
		LocalDate ld = LocalDate.now();
		ld = ld.plusDays(-ld.getDayOfMonth()+1);
		int startDay = ld.getDayOfWeek().getValue();
		int lastDay = ld.lengthOfMonth();
		for(int i = 1 - startDay ; i<= lastDay ; i++) {

			
			if(i > 0) {
				System.out.printf("%3d",i);
			}else {
				System.out.printf("%3c", ' ');
			}
			if(i % 7 == 7 - startDay) {
				System.out.println();
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int aaa = scanner.nextInt();
		for(int i = 1;i<=aaa;i+=4) {
			
			sum += aaa;
			System.out.println(sum);
		}
		
		
	}

}
