package com.edu;


	import java.util.Arrays;
	import java.util.function.Function;

	public class MethodRef {

	    public static void main(String[] args) {
	        //3. Reference to the instance method of an arbitrary Object
	        //Sometimes, we call a method of argument in the Lambda expression
	        //In that case , we can use a method reference to call an instance
	        //method of an arbitrary object of a specofic type
	        
	        Function<String, String> stringFunction = (String input)->input.toLowerCase();

	        System.out.println(stringFunction.apply("EDUBRIDGE"));
	        
	        //using method reference
	        Function<String, String> stringFunction1 =String::toLowerCase;
	        
	       // Function<String, String> stringFunction2 = String::toLowerCase;

	        System.out.println(stringFunction1.apply("EDUBRIDGE"));
	        
	        //Ex2
	        String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};
	        
	        //Using Lambda
	        Arrays.sort(strArray,(s1,s2)->s1.compareToIgnoreCase(s2));
	        
	        //using Method reference
	        Arrays.sort(strArray,String::compareToIgnoreCase);
	        
	        for(String s:strArray) {
	            System.out.println(s);
	        }
	    
	        
	        
	        
	    }

	}


