package lesson05_control;

import java.util.Scanner;

public class rockgame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 가위 1 , 바위 2 , 보 3 이겼을때 -2,1
		System.out.println("가위(1) 바위 (2) 보(3)");
		int me = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1 ;
		String res = "";
		switch(me - com) {
		case -2,1:
			res = "이겼습니다";
			break;
		case -1,2:
			res = "졌습니다";
		break;
		default:
			res = "비겼습니다";
		}
		
		System.out.println("나의패 : "+me + "\n 컴퓨터의 패 :" + com +"\n 결과 :"+res);

	}

}
