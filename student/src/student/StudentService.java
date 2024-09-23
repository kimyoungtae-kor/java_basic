package student;
import static student.StudentUtils.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Logic

// argv, argc "  "

// "abcdabcd".split("b") >> {"a", "cda", "cd"}

public class StudentService implements Serializable{
	private List<Student> students = new ArrayList<Student>();
	private List<Student> totalSortedStudents;
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;
	
	
//	private int cnt;
	//데이터베이스없이 파일 읽기쓰기로 학생 정보 저장하기.
	{
		students.add(new Student(1, "새똥이", 80, 90, 100));
		students.add(new Student(2, "개똥이", 77, 66, 77));
		students.add(new Student(3, "새똥이", 80, 90, 100));
		students.add(new Student(4, "개똥이", 77, 66, 77));
		try {
			loadlist();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		cloneAndSort();
	}
	// 학생 등록
	public void add() {
//		int no = nextInt("학번");
		int no = next("학번",Integer.class,n -> findBy(n) == null,"중복되지 않는 학번을 입력하세요");
		String name = next("이름",String.class,t -> t.matches("^[가-힣]{2,4}"),"한글로 2~4글자로 입력하세요");
		int kor = next("국어",Integer.class,i -> i>=0&&i<=100,"점수는 0~100점 입력해주세요");
		int eng = next("영어",Integer.class,i -> i>=0&&i<=100,"점수는 0~100점 입력해주세요");
//		int mat = checkRange(next("수학",Integer.class,i -> i>=0&&i<=100,"점수는 0~100점 입력해주세요"));
		int mat = next("수학",Integer.class,i -> i>=0&&i<=100,"점수는 0~100점 입력해주세요");
		// 
		
		students.add(new Student(no, name, kor, eng, mat));
	}
	// 학생 목록 조회
	public void list() {
		
//		System.out.println("list()");
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순",Integer.class,i->i>0&&i<5,"1~4번까지입력해주세요");
		List<Student> tmp = null;
		switch (input) {
		case 1:
			tmp = students;
			break;
		case 2:
			tmp = noSortedStudents;
			break;
		case 3:
			tmp = nameSortedStudents;
			break;
		case 4:
			tmp = totalSortedStudents;
			break;
		default:
			System.out.println("????");
			break;
		}
		System.out.println("학번   이름    국어    영어    수학    총점    평균");
		System.out.println("===================================================");
		for(int i = 0 ; i < tmp.size() ; i++) {
//			System.out.println(students[i]);
			System.out.println(tmp.get(i));
		}
	}
	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findBy(next("학번",Integer.class,i -> i>0,"학번은 0보다 커야합니다"));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.setName(next("이름",String.class, (a) -> { return a.length() >=2 && a.length() <=4; },"이름은 2글자보다 이상 4글자보다 이하여야 합니다"));
		s.setKor(next("국어",Integer.class,i ->i>=0&&i<=100,"점수는 0~100점 입력해주세요"));
		s.setEng(next("영어",Integer.class,i -> i>=0 && i <= 100,"점수는 0~100점 입력해주세요"));
		s.setMat(next("수학",Integer.class,i -> i>=0 && i <= 100, "점수는 0~100점 입력해주세요"));
		
	}
	// 학생 삭제
	public void remove() {
		Student s = findBy(next("학번",Integer.class,n -> findBy(n) != null,"입력한 학번은 존재하지 않습니다."));
		
		students.remove(s);
	}
	
	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
		for(int i = 0 ; i < students.size() ; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	/**
	 * 학생이름 유효성 검증, 이름은 반드시 한글, 최소 2 최대 4글자의 한글
	 * @param name 학생의 이름
	 */
//	String checkName(String name) {
//		char[] chs = name.toCharArray();
////		String s = new String(chs);
//		if(chs.length < 2 || chs.length > 4) {
//			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
//		}
//		// '가', '나', '다', '라'
//		for(char c : chs) {
//			if(c < '가' || c > '힣') {
//				throw new RuntimeException("한글로 구성된 이름으로 작성하세요");
//			}
//		}
//		return name;
//	}
	/**
	 * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * @param num 검증 대상 숫자
	 * @param start 시작 값
	 * @param end 종료 값
	 * @return 원래의 값
	 */
//	int checkRange(int num, int start, int end) throws RangeException{
//		if(num < start || num > end) {
//			throw new RangeException(start, end);
//		}
//		return num;
//	}
//	int checkRange(int num) throws RangeException {
//		return checkRange(num, 0, 100);
//	}
//	
	// 정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);
		
		noSortedStudents.sort((a, b) -> a.getNo() - b.getNo());
		nameSortedStudents.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		Comparator<Student> comp = new MyComp();
		totalSortedStudents.sort(comp);
	}
	
	
	public void loadlist() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream dis = new ObjectInputStream(new FileInputStream("student.txt"));
		List<Student> result = (List<Student>)dis.readObject();
		students = result;
	}
}
class MyComp implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.total() - o1.total();
	}
}

