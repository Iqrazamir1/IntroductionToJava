package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList(4);
		list.add("Iqra");
		list.add("Iqra");
		list.add("Ibrahim");
		list.add("Hamza");
		System.out.println(list);
		/* Useful for feedback/reviews because it let's you 
		 * add whatever you want
		 * */

		Set<String> set = new HashSet();
		set.add("Banana");
		set.add("Apple");
		set.add("Banana");
		set.add("Guava");
		set.add("Pinerapple");
		set.add("Mango");
		System.out.println(set);
		/* 1. Doesn't accept duplicates 
		 * 2. Unordered list
		 * */
		
		Set<String> set1 = new TreeSet();
		set1.add("Banana");
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Guava");
		set1.add("Pinerapple");
		set1.add("Mango");
		System.out.println(set1);
		/* 1. Accepts duplicates 
		 * 2. Ordered list (alphabetical)
		 * */
		
	}
}
