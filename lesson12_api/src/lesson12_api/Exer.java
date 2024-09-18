package lesson12_api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		// 달력 출력( 최소 이번달)
		// 이전달,다음달,이전해,다음해,특정 연월 입력시 해당 연월 달력 simpledata 로 년월일 문자열로 포맷터

				Scanner scanner = new Scanner(System.in);
				Calendar calendar = new GregorianCalendar();
		        Date date = new Date(calendar.getTimeInMillis()); 
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
				printC printer = new printC();
		        System.out.println(printer);
				int aaa =0;
//				System.out.println(sdf.format(calendar.getTimeInMillis()));
		        while(true) {
		        	System.out.println("\n현재 날짜: " + sdf.format(calendar.getTimeInMillis()));
		        	printer.printC(calendar);
		        	
		        	System.out.println("\n1. 이전 달");
		        	System.out.println("2. 다음달");
		        	System.out.println("3. 이전해");
		        	System.out.println("4. 다음해");
		        	System.out.println("5. 특정 연월 검색");
		        	System.out.println("6. 종료");
		        	System.out.println("7. URL과제");
		        	
		        	try {
			        	 aaa = scanner.nextInt();
		        	}catch(Exception e) {
		        		System.out.println("1~6번만 선택해주세요");
		        		scanner.nextLine();
		        		continue;
		        	}
		        	
		        	switch(aaa) {
		        		case 1:
//		        			printC(calendar.add(Calendar.MONTH, -1));
		        			calendar.add(Calendar.MONTH, -1);
		        			printer.printC(calendar);
		        			break;
		        		case 2:
		        			calendar.add(Calendar.MONTH, 1);
		        			printer.printC(calendar);
		        			break;
		        		case 3:
		        			calendar.add(Calendar.YEAR, -1);
		        			printer.printC(calendar);
		        			break;
		        		case 4:
		        			calendar.add(Calendar.YEAR, 1);
		        			printer.printC(calendar);
		        			break;
		        		case 5:
		        			System.out.println("년 월 을 입력해주세요 yyyy-mm");
		        			scanner.nextLine();
		        			String input = scanner.nextLine();
		        			try {
		        				String[] input2 = input.split("-");
		        			//	System.out.println(Arrays.toString(input2));
		        				int year = Integer.parseInt(input2[0]) ;
		        				int mon = Integer.parseInt(input2[1])-1;//0에서 시작함 0~11
		        				calendar.set(Calendar.YEAR, year);
		        				calendar.set(Calendar.MONTH, mon);
		        				printer.printC(calendar);
		        			}catch(Exception e) {
		        				System.out.println("잘못된 입력 형식입니다.");
		        				return;
		        			}
		        		case 6:
		        			System.out.println("시스템을종료합니다");
		        			return;
		        		case 7:
		        			URL();
		        			return;
		        	}
		        }
		
	}
	
	
	
	
	static void URL() {
		// URL 분석 (String class 사용)
				String str = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B0%80%EB%82%98%EB%8B%A4%EB%9D%BC";
				
				
				
				
			
				//1.프로토콜 ://앞에 프로토콜이라고한다
				String[] Url = str.split("://");
				String proTocol = Url[0]; 
				//2.도메인 : search.naver.com
				String[] urlSub = Url[1].split("/");
				String subDomain = urlSub[0];
				//3. 파일네임 search.naver
				String[] filename = urlSub[1].split("\\?");
				String fileName = filename[0];
				//4. quary string 쿼리스트링 
				String[] query = filename[1].split("&");
				
				//출력
				
				System.out.println("프로토콜 : "+proTocol);
				System.out.println("도메인 : "+subDomain);
				System.out.println("파일네임 : "+filename);
//				System.out.println(Arrays.toString(query));
				for (String param : query) {
		            String[] queryString = param.split("=");
//		            System.out.println(Arrays.toString(keyValue));
		            String key = queryString[0];
		            String value = queryString[1];
		            System.out.println("키 : "+key + " /// 값: " + value);
		        }
	}

}

