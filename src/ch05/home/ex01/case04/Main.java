package ch05.home.ex01.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.print("이름: ");
			tmp = sc.next();
			isGood = tmp;
			if(isGood)
				user.setUserName(tmp);
			else System.out.println("이름을 입력하세요.");
		} while(!isGood);
		
		
		do {
			System.out.print("나이: ");
			tmp = sc.next();
			isGood = tmp.matches("[1-9]*");
			if(isGood)
				user.setAge(Integer.parseInt(tmp));
			else System.out.println("숫자를 입력하세요.");
		} while(!isGood);
		
		
		System.out.println();
		System.out.printf("이름: %s\n나이: %d\n", user.getUserName(), user.getAge());
		System.out.println("가입일: " + user.getDate());		
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