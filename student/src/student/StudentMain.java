package student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import static student.StudentUtils.*;
public class StudentMain {
	public static void main(String[] args) throws IOException {
		// UI
		// Create Read Update Delete
		StudentService ss = new StudentService();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
		while(true) {
			try {
				int input = next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료",Integer.class,i -> i >0 && i <6,"1~5번까지만 선택헤주세요");
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
					ss.add();
					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ss.cloneAndSort();
					break;
				case 5:
					oos.writeObject(ss);
					System.out.println("bye");
					return;
				default:
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
	}
}
