package com.edu;

class BanlApplication{
	private double balance;
	
	public BanlApplication(double balance) {
		this.balance = balance;
	}
	
synchronized public void deposit(double damount) {
		if(damount<0)
		{
			System.out.println("amount should be positive");
			return;
		}
		this.balance=balance+damount;
		notify();
		System.out.println("Total amount ="+balance);
		
	}
	
synchronized public void withdraw(double wamount) throws InterruptedException {
		
		if(wamount>balance) 
			wait();
		System.out.println("After wait method");
		balance = balance-wamount;
		
		System.out.println("Balance amount ="+balance);
		
			
	}
	
}


public class Java19 {


	public static void main(String[] args) {
		BanlApplication banlApplication = new BanlApplication(1000);
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				try {
					banlApplication.withdraw(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				
				banlApplication.deposit(5000);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}


}