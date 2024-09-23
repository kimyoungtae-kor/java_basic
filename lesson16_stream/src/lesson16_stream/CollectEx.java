package lesson16_stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3,1,2,3,4,5,6,7,1,2,3,4,5,6,1,2,3);
		List<String> list =
		stream
		.distinct()
		.sorted((a,b) -> b-a)
		.map(i-> i+""+i)
		.collect(Collectors.toList());
		System.out.println(list);
		
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println);
	}
}
