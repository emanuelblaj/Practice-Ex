package com.justplay;

public class FibonacciMain {
	
	public  static int index = 0;
	public static int stoppingPoint = 80;
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.println("index: " + index + " -> " + n1);
		fibonacciSequence(n1, n2);
		
	}
	public static void fibonacciSequence(int n1, int n2) {
		System.out.println("index: " + index + " -> " + n2);
		if(index == stoppingPoint) {
			return;
		}
		index++;
		fibonacciSequence(n2, n1+n2);

	}
}
