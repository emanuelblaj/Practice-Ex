package com.youtube.dogclobmth;

/*Design and implement a class called Dog that contains instance data that represents the dog's name and age.
Define the Dog constructor to accept and initialize instance data. 
Include a method to compute and return the age of the dog in "person years" (multiply by 7).
Include a toString method that returns a one-line description of the dog.
Create a driver class called Kennel, whose main method instantiates and updates several Dog objects.

 */
public class Dog {
	private String _name;
	private int _age;
	
	public Dog(String name, int age) {
		_name = name;
		_age = age;
	}
	
	public String getName() {
		return _name;
	}
	
	public int getAge() {
		return _age;
	}
	
	public int getPersonYears() {
		return getAge()* 7;
	}
	
	public String toString() {
		return "The name of the dog is " + getName() + "\nThe dog's age in person's year is " + getPersonYears();
	}

}
