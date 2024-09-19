package lesson13_collection;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.put("C", 2);
		System.out.println(map);
		System.out.println(map.get("C"));
		System.out.println(map.get("A")+ 3);
		System.out.println(map.size());
		
		System.out.println(map.containsKey("D"));
		System.out.println(map.containsValue(1));
		
		//탐색
		Set<Map.Entry<String, Integer>> entries = map.entrySet();//1번째방법
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		
		
		
		Set<String> keys = map.keySet();//2번째방법
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key + "::"+map.get(key));
		}
		
		Collection<Integer> collection = map.values(); //값만가져오기
		System.out.println(collection);
		
		List<Integer> list = new ArrayList<Integer>(collection);
		Set<Integer> set = new HashSet<Integer>(collection);
		
		System.out.println(list);
		System.out.println(set);
	}
}
