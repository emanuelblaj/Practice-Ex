package com.threadimplrunnable;

// Use join.

public class MyThreadMulti implements Runnable{
	Thread thrd;
	
//	Construct a new thread.
	public MyThreadMulti(String name) {
		thrd = new Thread(this, name);
	}

//	A factory method that creates and starts a thread.
	public static MyThreadMulti createAndStart(String name) {
		MyThreadMulti myThrd = new MyThreadMulti(name);
		
		myThrd.thrd.start(); //start the thread
		return myThrd;
	}
	
//	Entry point of thread.
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In  " + thrd.getName() + ", count is " + count);
			}
		
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}
