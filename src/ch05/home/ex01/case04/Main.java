package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		User user = new User();
		String tmp = "";
		boolean isGood = false;
		
		do {
			isGood = false;
			System.out.print("이름: ");
			tmp = sc.nextLine();
			isGood = !(tmp.isEmpty());
			if(isGood) user.setUserName(tmp);
			else System.out.println("이름을 입력하세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			tmp = sc.nextLine();
			isGood = !(tmp.isEmpty()) && tmp.matches("[1-9]+"); 
			if(isGood) user.setAge(Integer.parseInt(tmp));
			else System.out.println("숫자를 입력하세요.");
		} while(!isGood);
		
		System.out.println();
		System.out.printf("이름: %s\n나이: %d\n", user.getUserName(), user.getAge());
		System.out.println("가입일: " + user.getDate());	
		*/
		String userName = "";
		int age = 0;
		LocalDate regDate = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힟]+");
			if(!isGood) System.out.println("ERROR] 이름을 입력하세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) age = Integer.parseInt(tmp);
			else System.out.println("ERROR] 나이를 입력하세요.");
		} while(!isGood);
		
		regDate = LocalDate.now();
		
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				user.getUserName(), user.getAge(), user.getRegDate());
	}
}

/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/