package com.edu;


//final class Parent{  //we cannt extend final class
 class Parent{
	final int k=10;
	private int pdata;
	public Parent(int pdata) {
		 //k=k+1; //final field cannot be changed
		 
		this.pdata=pdata;
		System.out.println("Parent constructor "+pdata);
	}
	
	private void  myfunct() {
		System.out.println("private method");
	}
	// final void display() { //final methhod cannot override
	  void display() {
		System.out.println("Parent display");
		myfunct();
	}
}


class Child extends Parent{ //IS-A
	
	public Child(int data) {
		super(data); //to call parent class constructor from chile
		System.out.println("Child constructor ");
	}
	//function overriding
	 void display() { //default
		
		System.out.println("child display");
		super.display();
		
	}
	 
	 void childFunction() {
		 System.out.println("Child function");
	 }
}
public class MainAppInhe {


	public static void main(String[] args) {
		
       // Child cobj = new Child(20); //it will allocate memory for parent and chile
		Parent cobj = new Child(20);
		cobj.display();
		//cobj.childFunction();
		//dynamic dispatch
		
		Parent pob =new Parent(78);
		pob.display();
		
	}


}


//parent method is final , we cannot override method
//if class is final we cannot extend the class