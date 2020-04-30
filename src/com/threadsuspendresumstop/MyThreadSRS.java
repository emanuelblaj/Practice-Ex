package com.threadsuspendresumstop;

// Suspending, resuming, and stopping a thread.

public class MyThreadSRS implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;
	
	public MyThreadSRS(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
	}
	
//	A factory method that creates and starts a thread.
	public static MyThreadSRS createAndStart(String name) {
		MyThreadSRS myThrd = new MyThreadSRS(name);
		
		myThrd.thrd.start(); // start the thread
		return myThrd;
	}
	
//	Entry point of thread.
	@Override
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int i = 1; i < 1000; i ++) {
				System.out.print(i + " ");
				if((i % 10 ) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
//				use synchronized block to check suspended and stopped.
				synchronized(this) {
					while(suspended) {
						wait();
					}
					if(stopped)
						break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		} 
		System.out.println(thrd.getName() + " exiting.");
		
	}
//	Stop the thread
	synchronized void mystop() {
		stopped = true;
		
//		The following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
//	Suspend the thread
	synchronized void mysuspend() {
		suspended = true;
	}
	
//	Resume the thread.
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}
