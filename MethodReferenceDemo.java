package com.edu;

	import java.util.function.Function;


	public class MethodReferenceDemo {


		public static void main(String[] args) {
			//Method reference to static method
			
			//create method using Lambda Expresession
			//convert to Method referenve
			//Ex 1
			Function<Integer, Double> function=(input)->Math.sqrt(input);
			System.out.println(function.apply(4));
			
			
			
			//using method reference
			Function<Integer, Double> functionMethodRef=Math::sqrt;
			System.out.println(functionMethodRef.apply(4));
			
			
		}


	}


