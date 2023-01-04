package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;  // c가 B 타입으로 promotion
		A a = c;  // c가 A 타입으로 promotion
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
		// String s = (String)c;
	}
}
