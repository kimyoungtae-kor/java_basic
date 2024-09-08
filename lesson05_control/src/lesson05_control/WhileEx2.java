package lesson05_control;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		boolean flag = true;
		int y = 1;
		while(flag) {
			System.out.println("더할 숫자를 입력해주세요");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			sum += num;
			if(num == 0) {
				flag = false;
			}
			if (y == 3) {
				break;
			}
			y++;
			System.out.println(y);
		}

		System.out.println(sum);
		scanner.close();
	}
}
