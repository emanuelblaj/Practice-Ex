package com.justplay;

public class JPEX {
	public static void main(String[] args) throws java.io.IOException{
		/*
		 * char ch, answer = 'k';
		 * 
		 * System.out.println("I'm thinking of a letter bettween a and z.");
		 * System.out.print("Can you guess it: ");
		 * 
		 * ch = (char) System.in.read(); if(ch == answer)
		 * System.out.println("**Right**");
		 * 
		 * else System.out.println(".. Sorry, you're wrong.");
		 */
//		int time = 1;
//		String timeOfDay;
//if(time >=5 && time <12 ) {
//	timeOfDay= "morning";
//} else if (time >= 12 && time < 20) {
//	timeOfDay = "daytime";
//} else {
//	timeOfDay = "night";
//}
//System.out.println(timeOfDay);

		int dayOfWeek = 8;
		String schedule;
		String strDays = "";
		
			switch(dayOfWeek) {
				case 1: schedule = "Gym in the morning.";
						strDays = "Monday";
					break;
				
				case 2: schedule = "Class after work.";
						strDays = "Tuesday";
					break;
				
				case 3: schedule = "Meetings all day.";
						strDays = "Wednesday";
					break;
				
				case 4: schedule = "Work from home";
						strDays = "Thursday";
					break;
				
				case 5: schedule = "Game night after work.";
						strDays = "Friday";
					break;
				
				case 6: schedule = "Free! For sleep";
						strDays = "Saturday";
					break;
				
				case 7: schedule = "Free! For Church.";
						strDays = "Sunday";
					break;
				
				default: schedule = "Try again!";
						strDays = "Wrong day";
				break;
				
			}
			System.out.println(strDays + " : " + schedule);

	}

}
