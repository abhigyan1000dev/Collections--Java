package com.collectionMain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapImplementation {

	public static void main(String[] args) {
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		mp.put("Abhigyan", 123);
		mp.put("Sharma", 1243);
		mp.put("Hello", 2424);
		mp.put("Rahul", 987);
		
		
		//Iterating using the forEach method
		
		mp.forEach((key,value)->{
			System.out.println(key+"->"+value);
		});
		
		System.out.println(mp.entrySet());
		System.out.println(mp.keySet());
		
	}

}
