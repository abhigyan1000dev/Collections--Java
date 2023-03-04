package com.collectionMain;

import java.util.*;

public class SetImplementation {

	public static void main(String args[])
	{
		Set<Integer> st=new HashSet<Integer>();
		st.add(1);
		st.add(3);
		
		st.add(1);
		st.add(2);
		st.add(0);
		
		
		st.add(89);
		st.add(6);
		System.out.println(st);
		
		
//		 Yh to hogyi HashSet se implementation set ki.. 
//		1.  Order Not Presereved
//		2.  Dupllicates allowed nhi honge bas.
//		3.  Sorted nahi honge 
		
		
		
//		 Implementaion using treeSet
		
//		1. Duplicates not allowed + Sorting hogyi hai isme 
		Set<Integer>st_ts=new TreeSet<Integer>();
		st_ts.addAll(st);
		System.out.println(st_ts);
	}
	
}
