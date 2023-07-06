package _3.LinkedList;

import java.util.LinkedList;

public class GetFirst {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use getFirst() to display the first item in the list
		System.out.println(cars.getFirst());
	}
}
