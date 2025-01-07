package com.studyopedia;

public class Demo 
	{
	public static void main(String args[]){
	if(args.length>0){
	System.out.println("Hello");
	for(int i=0;i<args.length;i++)
	System.out.println(args[i]+" ");
	}
	else
	{
	System.out.println("Data is not valid");
	}
	}
	}
