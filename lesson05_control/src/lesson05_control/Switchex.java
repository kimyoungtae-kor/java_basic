package lesson05_control;

public class Switchex {

	public static void main(String[] args) {
		int month = 11;
		String res = "";
		//3,4,5 봄
		//6,7,8 여름
		//9,10,11 가을
		//12,1,2 겨울
//		switch (month) {
//		case 3,4,5:
//			res = "봄";
//			break;
//		case 6,7,8:
//			res = "여름";
//			break;
//		case 9,10,11:
//			res = "가을";
//			break;
//		default:
//			res = "겨울";
//		}
//		System.out.println(res);
		switch (month/3) {
		case 1:
			res = "봄";
			break;
		case 2:
			res = "여름";
			break;
		case 3:
			res = "가을";
			break;
		default:
			res = "겨울";
		}
		System.out.println(res);
	}


}
