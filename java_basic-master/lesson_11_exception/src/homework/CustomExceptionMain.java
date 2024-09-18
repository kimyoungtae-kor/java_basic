package homework;

public class CustomExceptionMain {
	//학생 점수를입력받고 정상적으로 돌아가게만드는게 과제
	public static void main(String[] args) {
		
		Sc
		int num = nextInt("국어");
		if(num < 0 || num > 100) {
			throw new RangeException(0, 100);
		}
	}
}
