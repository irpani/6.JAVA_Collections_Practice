package _8.Map_HashMap;

import java.util.HashMap;

public class KeySet_Method {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
	}
}
