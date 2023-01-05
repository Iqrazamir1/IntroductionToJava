package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap();
		myMap.put(45326, "London"); // Key, Value
		myMap.put(43605, "New York"); 
		myMap.put(54833, "Shanghai"); 
		myMap.put(65378, "Sidney"); 
		myMap.put(54727, "Istanbul"); 
		myMap.put(55555, "Istanbul"); 
		
		for(Map.Entry m:myMap.entrySet()) {
			System.out.println(m.getKey()+"----"+m.getValue()); 
		}

		/* Only allows duplicates when 
		 * key is different
		 * */
		
	}
}
