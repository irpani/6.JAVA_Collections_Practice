package _0.Collection;

import java.util.ArrayList;

public class Add_Addall_Method {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");

		list.addAll(list1);
		System.out.println(list);
		// list.remove(2);
		list.removeAll(list1);
		// list.retainAll(list1);
		// list.clear();
		System.out.println(list);
		// System.out.println(list.isEmpty());
	}
}
