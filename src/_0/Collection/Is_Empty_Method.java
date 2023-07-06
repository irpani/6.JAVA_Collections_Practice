package _0.Collection;

import java.util.ArrayList;

public class Is_Empty_Method {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After Insertion");
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
	}
}