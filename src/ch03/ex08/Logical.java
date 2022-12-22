package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true; // true
		b = (2 > 1) && (2 > 1); // true
		b = 2 < 1 && 2 > 1; // false
		b = 2 < 1 || 2 > 1; // true
		b = 2 < 1 || 2 < 1; // false
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // 이미 x에서 false가 나왔기 때문에 y는 계산하지 않는다.
		
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
