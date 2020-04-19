package com.bitwiseop;

// Demonstrate ShowBitsWork

public class ShowBitsDemo {
	public static void main(String[] args) {
		ShowBitsWork b = new ShowBitsWork(8);
		ShowBitsWork i = new ShowBitsWork(31);
		ShowBitsWork li = new ShowBitsWork(64);
		
		System.out.println("123 in binary: ");
		b.show(123);
		
		System.out.println("\n87987 in binary: ");
		i.show(87987);
		
		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
//	You can also show low-order bits of any integer
		System.out.println("\nLow order 8 bits of 87987 in binary: ");
		b.show(87987);
	}
		
}
