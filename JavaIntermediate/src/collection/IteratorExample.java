package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorExample {
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList();
		
		Product prod1 = new Product("Bluetooth", "Sony", 50, 10);
		Product prod2 = new Product("TV", "Apple", 100, 120);
		Product prod3 = new Product("Camera", "Digitech", 40, 40);
		Product prod4 = new Product("Tripod", "Boat",20, 80);
		Product prod5 = new Product("Phone", "CEX", 45, 35);
		Product prod6 = new Product("Speaker", "Andriod", 90, 70);
		
		productList.add(prod1);
		productList.add(prod2);
		productList.add(prod3);
		productList.add(prod4);
		productList.add(prod5);
		productList.add(prod6);
		
		Iterator<Product> proItr = productList.iterator();
		while(proItr.hasNext()) {
			System.out.println(proItr.next());
		}
		
	}
}
