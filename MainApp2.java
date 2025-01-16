package com.edu;

//2. By implementing Runnable interface



class MyClass2 implements Runnable{


	@Override
	public void run() {
		System.out.println("Run method");
	}
	
}


public class MainApp2 {


	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		Thread t1=new Thread(obj);
		t1.start();
	}


}

