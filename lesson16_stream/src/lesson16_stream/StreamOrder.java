package lesson16_stream;

import java.nio.file.DirectoryStream.Filter;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamOrder {
	public static void main(String[] args) {
		// 스트림 생성
		
		//연산
		//1. 중간연산
		// 필터,맵,정렬,peek
		boolean result =
		Stream.of("홍길동","김유신","이순신","유관순").
		sorted().
		filter(s->!s.startsWith("김")).
		peek(System.out::println)
		.anyMatch(s -> s.startsWith("홍"));
		//.allMatch(s -> s.startsWith("홍"));
		System.out.println(result);
		//.count();
		//System.out.println(cnt);
		//forEach(System.out::println);
		//최종연산이 무조건필요함 peek으로 출력하지않음
		// 필터 
		//2. 최종연산
		//forEach.allMatch,anyMatch,집계
		//Optional중요
		String str = "가";
		Optional<String> optional = Optional.ofNullable(str);
		optional.ifPresent(System.out::println);
		}
	
	
}
