package com.youtube.dogclobmth;

import java.util.Scanner;

public class Kennel {

	public static void main(String[] args) {
		String name;
		int age = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the dog name and age: ");
		name = scan.next();
		age = scan.nextInt();
		
		scan.close();
		
		Dog dog = new Dog(name, age);
		Dog dog2 = new Dog("Chris", 5);
		Dog dog3 = new Dog("Pedro", 6);
		
		System.out.println(dog);
		System.out.println(dog2);
		System.out.println(dog3);
	}

}
