package com.edu;

	import java.util.Scanner;

	


	public class FrogJumpMain {
		static int dist;
		public static int calculateDist(int nohops) {
			dist=0;
			for(int i=1;i<=nohops;i++) { //no of hops=4
	        	if(i%3==1) {  //1%3==1  // 4%3==1
	        		       		
	        		dist=dist+20;  //dist=20   //dist=35+20=55
	             }
	        	else if(i%3==2) {  //2%3==2
	        		dist=dist+10;  //didt=20+10=30
	        	}
	        	else if(i%3==0){  //3%3==0
	        		dist=dist+5;  //dist=dist+5=30+5=35
	        		
	        		
	        	}
	        }
			return dist;
		}
		public static void main(String[] args) {
	       int nohops1,nohops2,nohops3,nohops4;
	       
			Scanner sc=new Scanner(System.in);
//			System.out.println("No of hops");
			nohops1=sc.nextInt(); //4
			nohops2=sc.nextInt(); 
			nohops3=sc.nextInt(); 
			nohops4=sc.nextInt(); 
			
	        
	        System.out.println(calculateDist(nohops1));
	        System.out.println(calculateDist(nohops2));
	        System.out.println(calculateDist(nohops3));
	        System.out.println(calculateDist(nohops4));


		}


	}