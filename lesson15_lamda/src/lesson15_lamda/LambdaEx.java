package lesson15_lamda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter<Integer> inter = t -> (t * t);

		int a = inter.m(10);
		System.out.println(a);
		MyInter<String> inter2 = t -> "안녕~!!" +t;
		
		System.out.println(inter2.m("새똥이"));
		
		Function<String, Integer> f = s -> Integer.parseInt(s);
//		Function<String, Integer> f2 = Integer::parseInt;
		
		int result = f.apply("1234");
		System.out.println(result + 1000);
		
		Object o = new MyInter<>() {

			@Override
			public Object m(Object t) {
				return t;
			}
			
		};
		Object o2 = (MyInter<String>)(s -> s);
	}

}

@FunctionalInterface
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	}
}
