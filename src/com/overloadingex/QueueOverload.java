package com.overloadingex;

// A Queue class for characters.

public class QueueOverload {

	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices
	
//	Construct an empty Queue given its size.
	QueueOverload(int size) {
		q = new char[size]; // allocate memory for queue.
		putloc = getloc = 0;
	}
	
//	Construct a Queue from a Queue.
	QueueOverload(QueueOverload ob ) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
//		copy elements
		for(int i = getloc; i < putloc; i++) 
			q[i] = ob.q[i];
	}
	
//	Construct a Queue with initial values.
	QueueOverload(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++)
			put(a[i]);
	}
	
//	Put a character into the queue.
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
//	Get a character from the queue. 
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0 ;
			
		}
		return q[getloc++];
	}
	
}
