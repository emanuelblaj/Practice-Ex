package com.justplay;

// Controlling the main thread.

public class UseMainThread {

	public static void main(String[] args) {
		Thread thrd;
		
//		Get the main thread.
		thrd = Thread.currentThread();
		
//		Display main thread's name.
		System.out.println("Main thread is called: " + thrd.getName());
		
//		Display main thread's priority.
		System.out.println("Priority: " + thrd.getPriority());
		
		System.out.println();
		
//		Set the name and priority.
		System.out.println("Setting name and priority.\n");
		thrd.setName("Thread #1");
		thrd.setPriority(Thread.NORM_PRIORITY+3);
		
		System.out.println("Main thread is now called: " + thrd.getName());
		
		System.out.println("Priority is now: " + thrd.getPriority());

//		If I add try code the program will never terminate because it will be waiting for the
//		main threa to end
		
//		try {
//			thrd.join();
//			
//		} catch(InterruptedException exc) {
//			System.out.println("Interrupted.");
//		}
	}

}
