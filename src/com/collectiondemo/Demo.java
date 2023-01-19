package com.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		for(Integer i : list) {
			System.out.println(i);
		}
	}			
}
