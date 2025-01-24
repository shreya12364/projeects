package com.edu;



import java.util.function.Predicate;


public class PrimeEvent {


	public static void main(String[] args) {
		int arr[]= {4,1,8,12,5,7,3};
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		Predicate<Integer> pob=(i)->i%2==0;
		
		printEven(pob,arr);
		
		Predicate<Integer> pob1=(i)->i%2!=0;
		
		printOdd(pob1,arr);


	}


	private static void printOdd(Predicate<Integer> pob1, int[] arr) {
		System.out.println("Odd numbers");
		for(int i:arr) {
			if(pob1.test(i)) {
				System.out.println(i);
			}
		}
		
	}


	private static void printEven(Predicate<Integer> pob, int[] arr) {
		System.out.println("Even numbers");
		for(int i:arr) {
			if(pob.test(i)) {
				System.out.println(i);
			}
		}
	}
}






