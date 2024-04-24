package _10.Iterators;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Irfan");
		hs.add("Ayaan");
		hs.add("Reshma");
		hs.add("Afhseen");
		// System.out.println(hs);

		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
		}
	}

}
