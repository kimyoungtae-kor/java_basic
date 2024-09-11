package student;

// 학생 예제 > java beans 명세서에 맞게끔 수정
// field 는 private, method는 public
public class Student implements Cloneable {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int [] arr;

	
	public Student() { }

	
	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student(Student s) {
		no = s.no;
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
		if(s.arr != null)
		arr = s.arr.clone();
	}
	
	// no getter
	public int getNo() {
		return no;
	}
	
	// no setter
	public void setNo(int no) {
		this.no = no;
	}
    public void setName(String name) {
        this.name = name;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public void setMat(int kor) {
        this.mat = kor;
    }
    
    public int getEng(int eng) {
        return eng;
    }
    public int getKor(int kor) {
        return kor;
    }
    public int getMat(int mat) {
        return mat;
    }
	
	public String toString() {
		return String.format("%4d %4s %6d %7d %7d %7d %7.2f", no, name, kor, eng, mat, total(), avg());
	}
	
	public int total() {
		return kor + eng + mat;
	}
	
	public double avg() {
		return total() / 3d;
	}
	//클론연습용
	@Override
	public Student clone(){
		Student obj = null;
		// TODO Auto-generated method stub
		try {
			obj = (Student)super.clone();
			if(arr != null) {
				obj.arr = this.arr.clone();	
			}
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	
	//equls연습용
	//인스턴스 비교
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) {
			return false;
		}
		Student s = (Student)obj;
		return no == s.no && name.equals(s.name);
	}
	

	

	
	
}
