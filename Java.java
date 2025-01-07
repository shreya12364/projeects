package com.studyopedia;

	import java.util.Scanner;



	class Caluculator{
		float n1,n2,r;
		
		public void inputData() {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter two numbers");
			n1=scanner.nextFloat();
			n2=scanner.nextFloat();
		}
		public void add() {
			r=n1+n2;
			System.out.println("the sum of "+n1+" and "+n2+ "is "+r);
		}
		public void subtraction() {
			r=n1-n2;
			System.out.println("the difference of "+n1+" and "+n2+ "is "+r);
			
		}
		public void multiplication() {
			r=n1*n2;
			System.out.println("the product of "+n1+" and "+n2+ "is "+r);
			
		}
		public void division() {
			if(n2==0) {
				System.out.println("Divide by zero error");
			}
			else {
			r=n1/n2;
			System.out.println("Quotient="+r);
			
		}
	}
	}


	public class Java {


		public static void main(String[] args) {
			int choice;
			Caluculator calculator = new Caluculator();
			
			//while(true) {
			for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("*****Calculator Menu*********");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			calculator.inputData();
			switch(choice) {
			case 1:calculator.add();
			        break;
			case 2:calculator.subtraction();
			       break;
			case 3:calculator.multiplication();
			       break;
			case 4:calculator.division();
			        break;
			default:System.out.println("Invalid input");
			
			}//switch case
			System.out.println("Do you want to continue press y,Y to continue , any other other key to stop");
			char ch = sc.next().charAt(0); //'y'
			if(ch=='y' || ch=='Y') {
				continue;  //go back to the loop
			}else {
				break; //come out of the the loop
			}
			}
			System.out.println("Program is terminated");
		}
	}













