package com.edu;

 
	import java.util.function.BiFunction;


	public class MethodRef2 {
		
		public static int add(int a, int b) {
			return (a+b);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Lambda Expression for static method
			BiFunction<Integer,Integer,Integer>biFunctionLambda=(a,b)->MethodRef2.add(a, b);
			System.out.println(biFunctionLambda.apply(10, 20));
			
			//using Method Reference
			BiFunction<Integer,Integer,Integer>biFunctionLambda1=MethodRef2::add;
			System.out.println(biFunctionLambda1.apply(10, 20));
	        
		}


	}

