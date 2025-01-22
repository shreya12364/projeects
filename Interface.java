package com.edu;
import  java.util.*;
public class Interface {
	public static void main(String[]  args)
	{
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(98);
		hashSet.add(23);
		hashSet.add(31);
		hashSet.add(31);
		hashSet.add(10);
		hashSet.add(null);
		System.out.println(hashSet);
		
		LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add(98);
		linkedHashSet.add(23);
		linkedHashSet.add(31);
		linkedHashSet.add(10);
		linkedHashSet.add(10);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		
		TreeSet<Integer> treeSet=new TreeSet<>();
		treeSet.add(98);
		treeSet.add(23);
		treeSet.add(31);
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(null);
		
		System.out.println(treeSet);
		
		System.out.println("HashSet");
		Iterator<Integer>itr=hashSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Integer integer : hashSet) {
			System.out.println(integer);
		}
		
		System.out.println("LinkedHashSet");
		Iterator<Integer>itr1=linkedHashSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr1.next());
		}
		for(Integer integer : linkedHashSet) {
			System.out.println(integer);
		}
		System.out.println("TreeSet");
		Iterator<Integer>itr2=treeSet.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr1.next());
		}
		for(Integer integer : treeSet) {
			System.out.println(integer);
		}
		
		}

}
