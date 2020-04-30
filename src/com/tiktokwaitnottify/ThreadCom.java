package com.tiktokwaitnottify;

public class ThreadCom {

	public static void main(String[] args) {
		TickTock tt = new TickTock();
		MyThreadTT mt1 = MyThreadTT.createAndStart("Tick", tt);
		MyThreadTT mt2 = MyThreadTT.createAndStart("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}

	}

}
