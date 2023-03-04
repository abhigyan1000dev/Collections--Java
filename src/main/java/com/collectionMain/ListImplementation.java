package com.collectionMain;



import java.util.*;
public class ListImplementation {

	public static void main(String[] args) {
		System.out.print("Hello bhai Abhigyan");
		
/*
 *  There are two types of collection:
 *  	1.Type Safe : Sirf usi type ka data dal paega us collection me
 *  
 *  	2. UnType Safe : Koi sa bhi element ad krdoge kisi bhi datatype ka
 * 	
 */
		
		List<Integer> li= new Vector<Integer>();  // Yh type safe collection hai ...
		li.add(1);
		li.add(3);
		li.add(4);
		li.add(87);
		li.add(21);
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		System.out.println(li.get(3));
		li.remove(1);
		
		li.set(3, 8765);
//		li.removeAll(li);
		Vector<Integer>vec=new Vector<Integer>();
		vec.addAll(li);
		System.out.println(vec);
//		System.out.println(li.contains(1));
		System.out.println(li);
		/*
		 * We won't be working over the unsafe collection
		 * 
		List arr=new LinkedList();
		arr.add("1234");
		arr.add(1);
		arr.add(24.342);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		*/
	}

}
