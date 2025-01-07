package com.studyopedia;

public class LinearSearch {
	    public static void main(String[] args) {
	      
	        int[] arr = {34, 12, 8, 54, 23, 4};
	        int target = 54;

	        
	        int result = linearSearch(arr, target);

	       if (result == -1) {
	            System.out.println("Element not found.");
	        } 
	       else 
	       {
	            System.out.println("Element found at index: " + result);
	        }
	    }

	
	    public static int linearSearch(int[] array, int target) {
	  
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; 
	            }
	        }
	        return -1; 
	    }
	}


