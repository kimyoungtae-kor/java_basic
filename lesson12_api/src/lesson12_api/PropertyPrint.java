package lesson12_api;

import java.util.Set;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
public class PropertyPrint {
	public static void main(String[] args) {
//		PropertyPrint props = System.getProperty();
//		Set<?> keys = props.keySet();
//		for(Object o : keys) {
//			String key = o.toString();
//			System.out.printf("%s ::::: %s\n",key,System.getProperty(key));
//		}
		
		//epoch time
//		1970.1.1 00:00:00 0 / 이 이후로 지난 ms
		
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
//		System.out.println(Calendar.getInstance().getTimeInMillis());
//		
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.MONTH, Calendar.DECEMBER);
//		cal.set(Calendar.DATE, 25);
//		System.out.println(cal);
//		long between = cal.getTimeInMillis() - System.currentTimeMillis();
//		System.out.println(between / 1000 / 60 / 60 / 24);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.OCTOBER);
		cal.set(Calendar.DATE, 22);
		System.out.println(cal);
		long between = cal.getTimeInMillis() - System.currentTimeMillis();
		System.out.println(between / 1000 / 60/60/24);
	}
}
