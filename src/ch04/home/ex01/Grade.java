package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score >= 94);
			else grade += "-";
		} else if(score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score >= 84);
			else grade += "-";
		} else {grade = "C";}
		System.out.println(grade);
		*/
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if (tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);
	}
}

/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/