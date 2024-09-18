package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		StudentService ss = new StudentService();
		int input = 0;
		while(true) {
			try {
				input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");	
			}catch(NumberFormatException e) {
				System.out.println("입력오류입니다 다시시도해주세요");
				continue;
			}
			
			switch (input) {
			case 1:
				ss.list();
				break;
			case 2:
				ss.add();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.remove();
				break;
			case 5:
				System.out.println("bye");
				return;
			default:
				break;
			}
		}
	}
}
