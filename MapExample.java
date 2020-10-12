package day44_Workers_Rights_Management_App;

import java.util.*;


public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Double> items = new HashMap<>();
		
		items.put("Apple", 3.49);
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.2);
		items.put("Cherries", 4.99);
		
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		
		System.out.println(items.get("Milk"));
		
		items.remove("Flowers");
		
		System.out.println(items.toString());
		
		
	}

}