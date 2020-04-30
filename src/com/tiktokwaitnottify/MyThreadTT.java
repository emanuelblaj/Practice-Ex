package com.tiktokwaitnottify;

public class MyThreadTT implements Runnable {
	Thread thrd;
	TickTock ttOb;
	
	public MyThreadTT(String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
	}
	
//	A factory method that creates and starts a thread.
	public static MyThreadTT createAndStart(String name, TickTock tt) {
		MyThreadTT myThrd = new MyThreadTT(name, tt);
		
		myThrd.thrd.start(); // start the thread
		return myThrd;
	}
	
//Entry point of thread.
	@Override
	public void run() {
		if(thrd.getName().compareTo("Tick") == 0) {
			for(int i = 0; i < 5; i++ )
				ttOb.tick(true);
			
			ttOb.tick(false);
		} else {
			for(int i = 0; i < 5;i++)
				ttOb.tock(true);
			
			ttOb.tock(false);
		}
		
	}
}
