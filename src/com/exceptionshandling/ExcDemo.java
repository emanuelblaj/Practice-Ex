package com.exceptionshandling;

public class ExcDemo {

	public static void main(String[] args) {
		
		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
//			catch the exception
			System.out.println("Idex out-of-bounds!");
		}
		System.out.println("After catch statement.");

	}

}
