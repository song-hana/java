package ch07.ex04.case05.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	/*
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static int inInt(String msg) {
		System.out.print(msg + "\n> ");
		int Int = 0;
		String tmp = "";
		boolean isGood = false;
		
		do {
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) Int = Integer.parseInt(tmp);
			else Console.info("숫자를 입력하세요.\n>");
		} while(!isGood);
		return Int;
	}
	*/
	
	private static void inMsg(String msg) {
		System.out.print(msg + ": ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood= false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood= input.matches("[a-zA-Z가-힝]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
		} while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
