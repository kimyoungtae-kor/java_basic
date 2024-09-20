package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
//		IntStream is = IntStream.range(1, 45);
//		is.forEach(System.out::println);
		
		//list를이용한
		List<Integer> list = IntStream.range(1, 45).mapToObj(s -> s).collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		//롱스트림
		LongStream ls = new Random().longs(6, 1, 45).sorted();
//		ls.forEach(System.out :: println);
//		ls.forEach(s -> System.out.println(s));
		IntBinaryOperator ibo =  Math::max;
		
		
		
		
		//펑션
		Function<String, Integer> f = Integer::parseInt;
//		int aaa = f.apply("1");
//		System.out.println(aaa);
		
		//메서드 람다식
//		BinaryOperator<String> bo = (x,y)-> x.concat(y);
		BinaryOperator<String> bo = String::concat;
		String aaa = bo.apply("A", "B");
		System.out.println(aaa);
		
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new;
		System.out.println(f2.apply("aaaaaaaaaaaaaa"));
		
		
//		Comparator<String> com = (x,y) -> x.compareTo(y);
		Comparator<String> com = String::compareTo;
		
//		
//		ls = "가나다라ABCD".chars();
//		ls.forEach(s -> System.out.println((char)ls));	
		
	}
}
