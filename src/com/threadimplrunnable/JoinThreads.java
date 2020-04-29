package com.threadimplrunnable;

public class JoinThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThreadMulti mt1 = MyThreadMulti.createAndStart("Child #1");
		MyThreadMulti mt2 = MyThreadMulti.createAndStart("Child #2");
		MyThreadMulti mt3 = MyThreadMulti.createAndStart("Child #3");

		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
		}
		catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}

}
