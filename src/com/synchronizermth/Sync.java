package com.synchronizermth;

public class Sync {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		
		MyThreadSum mt1 = MyThreadSum.createAndStart("Child #1", a);
		MyThreadSum mt2 = MyThreadSum.createAndStart("Child #2", a);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}

	}

}
