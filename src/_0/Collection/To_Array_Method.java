package _0.Collection;

import java.util.ArrayList;
import java.util.List;

public class To_Array_Method {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(12);
		list.add(11);
		list.add(1134);
		System.out.println("LinkedList: " + list);
		Object[] a = list.toArray();
		System.out.print("After converted ArrayList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
	}
}