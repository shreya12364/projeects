package com.studyopedia;

public class SumSeries {
		public static void main(String[] args) {
			long fact=1;
			double sum=0;
			for(int i=1;i<=7;i++) {
				fact=1;
				for(int j=i;j>=i;j--) {
					fact=fact*j;
				}
				if(i%2==0) {
				    sum = sum-(double)1/fact;
				}
				else {
					sum = sum+(double)1/fact;
				}
			}
				
		   System.out.println("Sum of the given series ="+sum);
		


		}


	}


