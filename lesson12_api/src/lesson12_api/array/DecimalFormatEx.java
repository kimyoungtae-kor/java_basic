package lesson12_api.array;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {
	public static void main(String[] args) throws ParseException {
//		format : 어떠한형태로 변환 원시 >문자열
//
//		parse : 문자열 > 원시
		double[] scores = {9090909.555,8080808080.6666,70.7777,60.66666666,50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(double d : scores) {
			System.out.println(df.format(d));
		}
		Number number = df.parse("9,99.99");
		double dou = number.doubleValue();
		System.out.println(dou);
	}
}
