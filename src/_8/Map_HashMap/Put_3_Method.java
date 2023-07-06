package _8.Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Put_3_Method {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		// Case(1):-
		// ----------------
		map.put(null, "Test1");
		map.put(null, "Test1");
		map.put(null, "Test1");
		map.put(null, "Test1");
		// Case(2):-
		// ----------------
		map.put(1, null);
		map.put(2, null);
		map.put(3, null);
		map.put(4, null);

		System.out.println(map);
	}
}
