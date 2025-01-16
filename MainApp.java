package com.edu;
//1. By extending Thread
class MyClass extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Run method is called "+Thread.currentThread());
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class MainApp {


	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());  //parent Thread
		MyClass obj = new MyClass(); //new state , 
		MyClass obj1 = new MyClass();
		obj.setName("first");
		obj1.setName("second");
		System.out.println("First Thread state "+obj.isAlive());
		
		obj.start(); //thread-0  //runnable
		System.out.println("First Thread state "+obj.isAlive());
		obj.join();
		System.out.println("First Thread state "+obj.isAlive());
		obj1.start(); //thread-1  //runnable
		
	}
}