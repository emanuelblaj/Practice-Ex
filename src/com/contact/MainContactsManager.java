package com.contact;

import java.util.Scanner;

public class MainContactsManager {
	public static void main(String[] args) {
		ContactsManager myContactManager = new ContactsManager();	
		
//			System out with String variable& Scanner
		System.out.println("Enter your adress: ");
		Scanner sc = new Scanner(System.in);
		String adress = sc.nextLine();
		System.out.println("You live at: " + adress);
		
		
//		System out with int variable&Scanner
		System.out.println("Enter your grade: ");
		Scanner scanner2 = new Scanner(System.in);
		int grade = scanner2.nextInt();
		if(grade > 90) {
			System.out.println("Wow! YOu did well!");
			
		} else {
			System.out.println("Not bad, but you can do better next time.");
		}
//		  Example with class in Main class
//		Contact friendJulien = new Contact();
//		
//		friendJulien.name = "Julien";
//		friendJulien.phoneNumber = "0432421453";
//		myContactManager.addContact(friendJulien);
//
//		Contact friendCristi = new Contact();
//		
//		friendCristi.name = "Cristi";
//		friendCristi.phoneNumber = "5252363413";
//		myContactManager.addContact(friendCristi);
//		
//		Contact friendAdrian = new Contact();
//		friendAdrian.name = "Adrian";
//		friendAdrian.phoneNumber = "4325468585";
//		myContactManager.addContact(friendAdrian);
//		
//		Contact result = myContactManager.searchContact("Cristi");
//		System.out.println(result.phoneNumber);
	}
}
