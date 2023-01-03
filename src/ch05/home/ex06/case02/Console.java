package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	/*
	private static Scanner sc;
	private static boolean isGood;
	private static String tmp;
	private static int num;
	
	static {
		sc = new Scanner(System.in);
		isGood = false;
		tmp = "";
		num = 0;
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine().trim();
			isGood = tmp.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		return tmp;
	}
	
	public static int inNum(String msg) {
		isGood = false;
		do {
			Console.inMsg(msg);
			tmp = sc.nextLine();
			isGood = (tmp.matches("[0-9]+") && !(tmp.startsWith("0")));
			if(isGood) num = Integer.parseInt(tmp);
			else Console.err("자연수가 아닙니다.");
		} while(!isGood);
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	*/
	
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		String input= "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힝]+");
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
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수가 아닙니다.");
		} while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
