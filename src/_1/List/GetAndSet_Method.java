package _1.List;

import java.util.ArrayList;

//Operatins (2).Changing Elemets:
//--------------------------------
//To access an element in the ArrayList, use the get() method and refer to the index number:
//whereas the set() method changes the element.
public class GetAndSet_Method {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		// _____accessing the element____
		System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts
																// from 0
		// _____ changing the element_____
		al.set(1, "Dates");
		// Traversing list
		for (String fruit : al)
			System.out.println(fruit);

	}
}