package _8.Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Clear_Method {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("England", "London");
		map.put("Germany", "Berlin");
		map.put("Norway", "Oslo");
		map.put("USA", "Washington DC");
		map.clear();
		System.out.println(map);
	}
}
