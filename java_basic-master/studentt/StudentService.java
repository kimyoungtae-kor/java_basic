package student;
import static student.StudentUtils.*;

import java.util.Arrays;

// Logic
public class StudentService {
	private Student[] students = new Student[5];
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(4, "개똥이", 77, 66, 77);
	}
	// 학생 등록
	public void add() {
		int no = nextInt("학번");
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
		}

			}
			
			String name;
			while(true) {
				
				name = nextLine("이름");
				
				boolean good = true;

				for(int i =0; i<name.length();i++) {
					char ch = name.charAt(i);
					if('가' <= ch && ch <= '힣' && name.length()>1&&name.length()<5) {
						good = false;
						break;
					}
//						else {
//						System.out.println("이름을 다시입력해주세요");
//						}
				}
				if(good == false) {
					break;
				}else {
					System.out.println("이름을 다시입력해주세요");
				}
			}
			
			
			int kor;
			while(true) {
				kor = nextInt("국어");
				
				if(kor>=0 && kor <=100) {
					break;
				}else {
					System.out.println("점수는 0~100점까지 입력가능합니다");
					
				}
			}
			
			
			
			
			int eng;
			
			while(true) {
				eng = nextInt("영어");
				
				if(eng>=0 && eng <=100) {
					break;
				}else {
					System.out.println("점수는 0~100점까지 입력가능합니다");
					
				}
			}
			
			
			
			
			
			int mat;
			while(true) {
				mat = nextInt("수학");
				
				if(mat>=0 && mat <=100) {
					break;
				}else {
					System.out.println("점수는 0~100점까지 입력가능합니다");
					
				}
			}
			
			
			if(cnt == students.length) {
				students = Arrays.copyOf(students, students.length * 2); 
			}
			students[cnt++] = new Student(no, name, kor, eng, mat);
			break;
			
		}
		
	}
	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(students[i]);
		}
		System.out.println(Arrays.toString(students));
	}
	// 학생 이름, 점수 수정
	public void modify() {
		Student s = findByNo(nextInt("학번"));
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
        s.setName(nextLine("이름"));
        s.setKor(nextInt("국어"));
        s.setEng(nextInt("영어"));
        s.setMat(nextInt("수학"));
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findByNo(nextInt("학번"));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i] == s) { // i = 1
				System.arraycopy(students, i + 1, students, i, cnt-- - i - 1);
				break;
			}
		}
	}
	
	private Student findByNo(int no) {
		Student student = null;
		int no = nextInt("학번");
		for(int i = 0 ; i < cnt ; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}
		return student;
	}
}
