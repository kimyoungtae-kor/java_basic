package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		
		//UI
		//CRUD (Create Read Update Delete)
		//학번은 1,2,3,4
		//학생데이터 삭제
		//학생 이름 수정
		//정렬 사용 이름혹은 석차순
		//등록 수정 삭제
		//배열의 길이를 늘리는 과제 
		// Car 배열 두가지
		
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		while(true) {
//			System.out.println("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
//			int input =Integer.parseInt(scanner.nextLine());
			int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			switch (input) {
			case 1:
				ss.list();
				System.out.println("조회");
				break;
			case 2:
				ss.add();
				System.out.println("등록");
				break;
			case 3:
				ss.modify();
				System.out.println("수정");
				break;
			case 4:
				ss.remove();
				System.out.println("삭제");
				break;
			case 5:
				System.out.println("bye");
				return;
			default:
				System.out.println("메뉴에있는 번호를 입력해주세요");
			}
		}

	}
}
