package com.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Rupali");
		map.put(2, "Spruha");
		map.put(3,"Meena");
		map.put(4,  "Trupti");
		map.put(5, "Anilkumar");
		
		Set<Integer> set = map.keySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println("Keys : "+i);
			System.out.println("Values : "+map.get(i));
		}
	}			
}
