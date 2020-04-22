package com.exceptionsqueue;

// An exception for queue-empty errors.

public class QueueEmptyException extends Exception {
	@Override
	public String toString() {
		
		return "\nQueue is empty.";
	}
}
