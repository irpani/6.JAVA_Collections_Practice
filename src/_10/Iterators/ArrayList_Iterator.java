package _10.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iterator {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(500);
		li.add(100);
		li.add(300);
		li.add(200);
		System.out.println(li);

		Iterator<Integer> it = li.iterator();

		while (it.hasNext()) {
			Integer intgr = it.next();
			System.out.println(intgr);
		}
	}

}
