package day200811;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
//		Set set = new HashSet();
//		set.add("a");
//		set.add("b");
//		set.add("c");
//		set.add("d");
//		set.add(null);
//		for(Object o: set) {
//			System.out.println(o);
//		}
		Object o;
		
		Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()  + "   " + entry.getValue());
		}
		
	}
}
