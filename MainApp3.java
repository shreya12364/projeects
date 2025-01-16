package com.edu;


	class MultiplicationTable{
		synchronized void printTable(int n) {
			for(int i=1;i<=10;i++) {
				System.out.println(n+"X"+i+"="+n*i);
			}
		}
	}


	class Thread1 extends Thread{
		MultiplicationTable table;
		public Thread1(MultiplicationTable table) {
			this.table=table;
		}
		public void run() {
			table.printTable(2);
		}
	}


	class Thread2 extends Thread{
		MultiplicationTable table;
		public Thread2(MultiplicationTable table) {
			this.table=table;
		}
		
		public void run() {
			table.printTable(5);
		}
		
	}


	public class MainApp3 {


		public static void main(String[] args) throws InterruptedException {
			MultiplicationTable table = new MultiplicationTable();
			
			Thread1 t1= new Thread1(table);
			Thread2 t2= new Thread2(table);
			t1.start();
			//t1.join();
			t2.start();


		}


	}






