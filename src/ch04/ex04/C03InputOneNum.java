package ch04.ex04;

import java.util.Scanner;

public class C03InputOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
		//} while(1 > input || input > 9);  // 과제: 자연수 1 이상 9 이하를 입력할 때까지 입력 받아라.
		} while( !(1 <= input && input <= 9)); // 해당 방식이 가독성이 좋음
		
		System.out.println("끝.");
	}
}
