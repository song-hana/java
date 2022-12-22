package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if (hour < 18) {
			System.out.println("Good Afternoon.");
		} else if (hour < 21) {
			System.out.println("Good Evening.");
		} else {
			System.out.println("Good night.");
		}
		
		// 과제: code 7 ~ 15 Line 을 개선하라. 
		// 		 .println() 을 한번만 사용하라.
		/*
		String msg = "";
		if(hour < 12) {
			msg = "Good Morning.";
		} else if (hour < 18) {
			msg = "Good Afternoon.";
		} else if (hour < 21) {
			msg = "Good Evening.";
		} else {
			msg = "Good night.";
		}
		
		System.out.println(msg);
		*/
		
		String bow = "";
		if(hour < 12) bow = "Good Morning";
		else if (hour < 18) bow = "Good Afternoon";
		else if (hour < 21) bow = "Good Evening";
		else bow = "Good night";
		System.out.println(bow);
	}
}
