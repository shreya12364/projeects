package com.edu;	

	import java.util.Scanner;


	public class ValidateUser {


		public static void main(String[] args) {
			
			String uname,upass;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter username and password");
			uname=sc.next();
			upass=sc.next();
			
			if(uname.equalsIgnoreCase("edubridge") && upass.equals("edu123")){
				System.out.println("Login successful");
			}else {
				System.out.println("Invalid User ! try again");
			}


		}


	}

