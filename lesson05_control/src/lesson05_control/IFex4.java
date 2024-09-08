package lesson05_control;

public class IFex4 {
	public static void main(String[] args) {
		//계절계산
		
		int month = 5;
		String res = "";
		//3,4,5 봄
		//6,7,8 여름
		//9,10,11 가을
		//12,1,2 겨울
		if(month >=3 && month<= 5) {
			res = "봄";
		}else if(month >=6 && month<= 8 ) {
			res = "여름";
		}else if(month >=9 &&month<= 11 ) {
			res = "가을";
		}else {
			res = "겨울";
		}
		System.out.println(res);
	}

}
