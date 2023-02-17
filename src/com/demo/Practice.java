package com.demo;

public class Practice implements Runnable {
	
	public void run() {
		
		for (int i=0 ; i<=5 ; i++) {
			
			try {
				Thread.sleep(500);
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			Thread.currentThread().setName("First thread");
			System.out.println(Thread.currentThread().getName() + i);
			
			Thread.currentThread().setPriority(7);
		}
		
	}			
	public static void main(String[] args) {

		Practice p1 = new Practice();
		Thread th = new Thread(p1);
		th.start();
		
		for (int i=0 ; i<=5 ; i++) {
			System.out.println(i);
			
			Thread.yield();
			
			System.out.println(Thread.currentThread().getPriority());
						
			System.out.println(Thread.currentThread().getName() + i);
		}
	}


}
