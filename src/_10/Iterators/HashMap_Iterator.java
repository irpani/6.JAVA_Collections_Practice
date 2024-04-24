package _10.Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Iterator {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("irfan", 200);
		hm.put("Reshma", 100);
		hm.put("Ayaan", 300);
		hm.put("Afsheen", 400);

		// System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.get("irfan"));
		System.out.println(hm.get("Reshma"));
		System.out.println(hm.get("Ayaan"));
		System.out.println(hm.get("Afsheen"));

		// Case (1)

		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println(key + "--> " + hm.get(key));
		}
		System.out.println("-----------");
		// Case (2)

		Iterator<String> it = hm.keySet().iterator();

		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + "-- " + hm.get(string));
		}
		System.out.println("-----------");
		// Case (3)

		Set<Entry<String, Integer>> entry = hm.entrySet();

		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey() + "--" + entry2.getValue());
		}

	}

}
