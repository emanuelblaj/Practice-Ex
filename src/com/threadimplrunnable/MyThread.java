package com.threadimplrunnable;

// Create a thread by extend Thread class.

public class MyThread extends Thread {
	
//	Construct a new thread.
	public MyThread(String name) {
		super(name); //name thread
	}
	
//	Entry point of thread.
	public void run() {
		System.out.println(getName() + " starting.");
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is " + count);
			} 
		} 
		catch(InterruptedException exc) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
		
	}
}
