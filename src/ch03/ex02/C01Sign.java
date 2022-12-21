package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i;  // = x1을 한 것과 같다.
		System.out.println(i);
		
		i = -10;
		i = -i;
		System.out.println(i);
	}
}
