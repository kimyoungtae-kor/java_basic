package student;

import java.util.Arrays;

//Logic
//수정,삭제,등록,조회
public class StudentService {
	

	Student[] students = new Student[5];
	int cnt;

	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		students[cnt++] = new Student(3, "피똥이", 80, 90, 100);
//		students[cnt++] = new Student(4, "끼똥이", 77, 66, 77);
	}
	int no =cnt;
	//학생 등록
	void add() {
		if(students.length<=cnt) {
			Student[] students2 =new Student[students.length * 2];
			for(int i=0 ; i<cnt ;i++) {
				students2[i] = students[i];
			}
			students = students2;
		}
		
	
		int no1 = ++no;
		System.out.println(no1);
		String name = StudentUtils.nextString("이름");
		int kor = StudentUtils.nextInt("국어");
		int eng = StudentUtils.nextInt("영어");
		int mat = StudentUtils.nextInt("수학");
		students[cnt++] = new Student(no1, name, kor, eng, mat);
		System.out.println(Arrays.toString(students));
		System.out.println(cnt);
	}
	//학생 목록
	void list() {
		System.out.println("list");
		System.out.println("학번 	이름 	국어 	영어 	수학 	총점 	평균");
		System.out.println("=====================================================");
		for(int i =0;i<students.length;i++) {
			if(students[i] != null) {
			System.out.printf("%4d %6s %5d %6d %7d %7d %7.2f \n",
					students[i].no,
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].mat,
					students[i].total(),
					students[i].avg()
					);
			}
		}
	}
	//수정
	void modify() {
		String moname =StudentUtils.nextString("수정할 이름을입력해주세요");
		list();
		int no1 = StudentUtils.nextInt("수정할 학번을 입력해주세요");

//		for(int i=0;i <=students.length;i++) {
//			if(students[i].no == no1) {
//				students[i].no = no1;
//		students[i].name = moname;
//			}
//		}

		int tmp = 0;
		for(int i=0;i <students.length ;i++) {
//			if(students[i] == null) {
//				i++;
//			}
			if(students[i].no == no1 &&students[i] != null ) {
				tmp = i;
				break;
			}
			
			
		}
		students[tmp].name = moname;
		System.out.println("수정완료");
	}
	//학생 삭제
	void remove() {
		list();
	    int no1 = StudentUtils.nextInt("삭제할 학번을 입력해주세요");
	    int tmp =0;
	    int idx = 0;
	    for(int i =0; i<cnt && students[i] != null; i++) {
//			if(students[i] == null) {
//				i++;
//			}
	    	if(students[i].no ==no1) {
	    		students[i] = null;
	    		idx = i;
	    		break;
	    	}
	    }
	    for(int j = idx;j<students.length - 1;j++) {
	    	students[j] = students[j + 1];
	    	
	    }
	    
	    
	    for(Student aa: students) {
	    	System.out.println(aa);
	    }
	    cnt--;

		System.out.println(cnt);
		
	}

}
