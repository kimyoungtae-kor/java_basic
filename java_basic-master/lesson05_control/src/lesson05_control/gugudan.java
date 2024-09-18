package lesson05_control;

public class gugudan {
	public static void main(String[] args) {
		
		
		//A * B = C
		// B가 5였을때 건너 뛰고 출력
		//continue = 다음증감식으로 넘어감
		//break = 5일때 출력금지
		//point: = 라벨붙임
		
		
		point:
		for(int i = 2; i<=10; i++) {
				System.out.println("["+i+"단]");
			for(int j=1;j<=9; j++) {
				if(j == 5) {
					break point;
				}
				System.out.println(i + "x"+j+"="+i * j);
			}
		}
	}
}
