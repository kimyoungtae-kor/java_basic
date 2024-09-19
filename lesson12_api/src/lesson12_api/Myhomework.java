package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Myhomework {
	public static void main(String[] args) {
		
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//		System.out.println(sdf.format(calendar.getTimeInMillis()));
		
		
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("현재 날짜 : "+ sdf.format(calendar.getTimeInMillis()));
		System.out.println(" 일 월 화 수 목 금 토 ");
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


  	static void URL(){
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
		
		String[] aaa = str.split("://");
		String proTocol = aaa[0];
		System.out.println(proTocol);
		String[] bbb = aaa[1].split("/");
		String domain = bbb[0];
		System.out.println(domain);
		String[] ccc = bbb[1].split("\\?");
		String subDomain = ccc[0];
		System.out.println(subDomain);
		
		String[] ddd = ccc[1].split("&");
		for(String arr : ddd) {
			String[] queryString = arr.split("=");
			System.out.println(" key :" + queryString[0] );
			System.out.println(" value : " + queryString[1]);	
		}
	}
}
