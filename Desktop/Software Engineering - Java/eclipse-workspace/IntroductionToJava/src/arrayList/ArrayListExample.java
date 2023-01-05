package arrayList;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		int[] x = new int[5];
		ArrayList list = new ArrayList();
		list.add("Iqra");
		list.add(12.55);
		list.add(1234);
		list.add(true);
		list.add('Y');
		System.out.println(list);
		
		// Specifying a data type 
		ArrayList<String> names = new ArrayList<String>();
		names.add("Iqra");
		names.add("Ibrahim");
		names.add("Hamza");
		names.add("Uzma");
		names.add("Zamir");
		names.set(2, "Iqra"); // Replaces Hamza with Iqra
		for(int i = 0; i < names.size(); i++) { // Size of the array 
			System.out.println(names.get(i)); // Gets value from the array
		} 

		// Primitive data types don't work (int) rather you have to use classes (Integer)
		ArrayList<Integer> nums = new ArrayList();
		ArrayList<Float> f = new ArrayList();
		ArrayList<Character> c = new ArrayList();
		ArrayList<Double> d = new ArrayList();
		ArrayList<Short> s = new ArrayList();
		ArrayList<Long> l = new ArrayList();
	}
}
