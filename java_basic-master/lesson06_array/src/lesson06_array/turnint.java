package lesson06_array;

public class turnint {
	public static void main(String[] args) {
		//알고보면 개쉽넹진짜... 이렇게또 성장합니다
		int number = 12321;
		int tmp = number;
		int result =0;
		while(tmp !=0) {
			result = result*10 + tmp % 10;//(0+1),(10+2),(120+3)...
			tmp /=10; //1232,123,12,1
		}
		System.out.println(number == result ? "회문수":"not 회문수");
	}
}
