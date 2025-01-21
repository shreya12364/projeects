package com.edu;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class Java20{

	public static void main(String[] args) {
	    //int a[]=new int[5];
	    ArrayList<Integer> alist = new ArrayList<Integer>();
	    alist.add(76);
	    alist.add(90);
	    alist.add(67);
	    alist.add(57);
	    alist.add(55);
	    alist.add(51);
	    alist.add(59);

	    System.out.println(alist);

	    ArrayList<String> slist = new ArrayList<String>();
	    slist.add("Shreya");
	    slist.add("Sadvi");

	    System.out.println(slist);

	    ArrayList<Float> flist = new ArrayList<Float>();
	    flist.add(98.4f);
	    flist.add(18.4f);
	    System.out.println(flist);

	    ArrayList<Double> dlist = new ArrayList<Double>();
	    dlist.add(67.4);
	    dlist.add(87.6);
	    System.out.println(dlist);


	    Iterator<Integer> IntItr=alist.iterator();
	    while (IntItr.hasNext()){
	        float element=IntItr.next();
	        System.out.println(element);
	    }


	    Iterator<String> sItr=slist.iterator();
	    while (sItr.hasNext()){
	        String element=sItr.next();
	        System.out.println(element);
	    }

	    Iterator<Float> fItr=flist.iterator();
	    while (fItr.hasNext()){
	        float element=fItr.next();
	        System.out.println(element);
	    }

	    Iterator<Double> dItr=dlist.iterator();
	    while (dItr.hasNext()){
	        double element=dItr.next();
	        System.out.println(element);
	    }

	}
	}

