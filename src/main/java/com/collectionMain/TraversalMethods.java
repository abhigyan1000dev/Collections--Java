package com.collectionMain;
import java.util.*;
public class TraversalMethods {

	public static void main(String[] args) {
		
		
		
		List<String> li =new ArrayList<String>();
		li.add("Abhigyan");
		li.add("Gayatri");
		li.add("Ved Prakash");
		li.add("Harinom");
		li.add("Rahul");
//		for(String ss:li)
//		{
//			System.out.print(ss + "\t"+ ss.length() +"\t");
//			StringBuilder br= new StringBuilder(ss);
//			System.out.println(br.reverse());
//		}
		
		
		
		// Performing operation using Iterator of Collection.
//		Iterator<String> iter =li.iterator();
//		Forward iteration horhi h
//		while(iter.hasNext())
//		{
//			String name=iter.next();
//			System.out.println(name);
//		}
//			
		
		
		//Now List Iterator use kro
		Iterator<String> listIter= li.listIterator();
		while(listIter.hasNext())
		{
			String name = listIter.next();
			System.out.println(name);
		}
		
		System.out.println("++++++++++++++++++++++++");
		
		
		ListIterator<String> litrIterator= li.listIterator(li.size());
//		Agar Piche se traverse krna hai to PreviousIterator use krna pdega..
		while(litrIterator.hasPrevious())
		{
			String name=litrIterator.previous();
			System.out.println(name);
			
		}
		
		
		
		
		// using forEach() method in collection 
		
		
		
		System.out.println("++++++++++++");
		li.forEach(e->{
			System.out.println(e);
		});
		
	}

}
