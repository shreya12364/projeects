package com.edu;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;


public class ThreadList {


	public static void main(String[] args) {
		//int a[]=new int[5];
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(76); //0
		alist.add(90);//1
		alist.add(67);//2
		alist.add(57);
		alist.add(55);
		alist.add(51);
		alist.add(59);
		
		System.out.println(alist);
		
		//using for loop
		
		for(int v:alist) {
			System.out.println(v);
		}
		
		alist.add(2,78);
		alist.addFirst(98);
		//Iterator
		Iterator<Integer> itobj = alist.iterator();
		while(itobj.hasNext()) {
			int e = itobj.next();
			System.out.println(e);
		}
			
		//System.out.println(alist.contains(980));
		
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		alist1.add(760); //0
		alist1.add(900);//1
		alist1.add(670);
		
		alist.addAll(alist1);
		System.out.println(alist);
		
		alist.clear();
		System.out.println(alist);
		
		

	}


}








