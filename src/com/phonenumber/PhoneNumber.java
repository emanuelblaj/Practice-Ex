package com.phonenumber;

import java.util.Random;

public class PhoneNumber {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int first = rnd.nextInt(8);
		int second = rnd.nextInt(8);
		int third = rnd.nextInt(8);
		int middle = rnd.nextInt(742);
		int last = rnd.nextInt(9999);
		
		String middleString;
		String lastString;
		
		middleString = Integer.toString(middle);
		lastString = Integer.toString(last);
		
		while(middleString.length() < 3) {
			middleString = "0" + middleString;
		}
		
		while(lastString.length() < 4) {
			lastString = "0" + lastString;
		}
		
		System.out.println(Integer.toString(first) + Integer.toString(second) + Integer.toString(third) + "-" + Integer.toString(middle) + "-" + Integer.toString(last));
	}

}
