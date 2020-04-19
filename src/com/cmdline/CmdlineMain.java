package com.cmdline;

public class CmdlineMain {
	public static void main(String[] args) {

		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("minInt=" + minInt);
		System.out.println("maxInt=" + maxInt);
		System.out.println("minLong=" + minLong);
		System.out.println("maxLong=" + maxLong);
		System.out.println("passed arguments: " + args.length);
	}
}

