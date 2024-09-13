package lesson03_variable;
import java.time.LocalDate;
public class threeif {
	
	public static void main(String[] args) {
		//용태가 한줄씩 해석본 
		LocalDate ld = LocalDate.now();	//8월 30일로 가정

		ld = ld.plusDays(-ld.getDayOfMonth()+1);// +1 때문에 -8월 29일에서 ld.plusDays 메서드로인해 8월30일 - 8월29일 = 8월 1일
		int startDay = ld.getDayOfWeek().getValue();//8월 1일기준으로 목요일 즉 4값을가져옴
		
		
		int lastDay = ld.lengthOfMonth();//31일
		for(int i = 1 - startDay ; i<= lastDay ; i++) {
			//1 - 4 = -3
			//31일까지 반복
			
			if(i > 0) {
				// 31일까지 반복인데 1일부터시작
							System.out.printf("%3d",i);
			}else {
				//-3만큼 빈칸 위에 조건이 0보다 크다 이기때문에 -3.-2.-1.0 총 4칸을빈칸을만듬
				System.out.printf("%3c", ' ');
			}
			
			if(i % 7 == 7 - startDay) {
				// 나머지계산으로 인해 3,10,17일에서 엔터역활
				System.out.println();
			}
		}
	}
}

