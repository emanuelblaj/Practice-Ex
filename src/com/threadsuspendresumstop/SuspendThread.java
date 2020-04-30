package com.threadsuspendresumstop;

public class SuspendThread {

	public static void main(String[] args) {
		MyThreadSRS mt1 = MyThreadSRS.createAndStart("My Thread");
		
		try {
			Thread.sleep(1000); // let ob1 thread start execuring
			
			mt1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			mt1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			mt1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			mt1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			mt1.mysuspend();
			System.out.println("Stopping thread.");
			mt1.mystop();
		} catch(InterruptedException e) {
			System.out.println("Main thread Interrputed.");
		}
//		Wait for thread to finish
		
		try {
			mt1.thrd.join();
		} catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}

}
