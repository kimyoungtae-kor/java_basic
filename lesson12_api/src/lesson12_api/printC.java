package lesson12_api;

import java.util.Calendar;
import java.util.Date;

public class printC {
	
	
	
	public printC() {

	}
	public void printC(Calendar calendar) {
		calendar.set(Calendar.DAY_OF_MONTH, 1); 

        Date firstDay = calendar.getTime();  // 시작일

        
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);  // 일=1 토=7



        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(" 일 월 화 수 목 금 토 ");
//		for(int i = 1 - startDay ; i<= lastDay ; i++) {
//			//1-1 = 0;
//			
//			if(i > 0) {
//
//							System.out.printf("%3d",i);
//			}else {
//				
//				System.out.printf("%3c", ' ');
//			}
//			
//			if(i % 7 == 7 - startDay) {
//
//				System.out.println();
//			}
//		}
        for (int i = 1; i<startDay;i++) {
        	System.out.printf("%3c", ' ');
        }
        for (int i= 1;i <=lastDay;i++) {
        	System.out.printf("%3d",i);
        	
        	if((i+startDay - 1)%7 ==0) {
        		System.out.println();
        	}
        }
	}
}
