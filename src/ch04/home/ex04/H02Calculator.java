package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String input1 = "";
		String input2 = "";
		String op = "";
		String sum = "";
		int value = 0;
		int input_1 = 0;
		int input_2 = 0;
		String toNext = "y";
		
			
		do {
			do {
				System.out.print("a: ");
				input1 = sc.nextLine();
				if (input1.equals("") || !(input1.matches("[0-9]"))) System.out.println("숫자를 입력하세요."); 
			} while(!(input1.matches("[0-9]")));
						
			do {
				System.out.print("op: ");
				op = sc.nextLine();
				if (op.equals("") || !(op.matches("[+, -, *, /]"))) System.out.println("+, -, *, /중 하나 입력하세요."); 
			} while(!(op.matches("[+, -, *, /]")));
			
			do {
				System.out.print("b: ");
				input2 = sc.nextLine();
				if (input2.equals("") || !(input2.matches("[0-9]"))) System.out.println("숫자를 입력하세요."); 
			} while(!(input2.matches("[0-9]")));
			
			sum = input1  + " " + op + " " + input2;
			
			input_1 = Integer.parseInt(input1);
			input_2 = Integer.parseInt(input2);
			value = switch(op) {
			case "+" -> input_1 + input_2;
			case "-" -> input_1 - input_2;
			case "*" -> input_1 * input_2;
			case "/" -> input_1 / input_2;
			default -> 0;
			};
			
			System.out.printf("%s = %d\n", sum, value);
			System.out.print("continu(y/n)?\n> ");
			toNext = sc.nextLine();

		} while(toNext.equalsIgnoreCase("y"));
		
		System.out.println("end.");
		*/
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "Input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");  // regular expression
				if(!isGood) System.out.println("input one of them(+, -, *, /)."); 
			} while(!isGood);
			
			do {
				isGood = false;		
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}

/*
과제: 계산기를 만들어라.
입력값 a, b는 0 또는 자연수이다.
연산자는 +, -, *, / 이다.
/ 는 몫만을 구한다.

continue(y/n)? 에서 y 또는 Y를 입력하면 계산 작업을 재수행한다.
y 또는 Y 외를 입력하면 앱을 종료한다.
--

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/