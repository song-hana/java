package ch06.ex02.case01;

public class A {
	private int a;
	int b;  // default  같은 패키지 내에서만 보임
	protected int c;  // 같은 패키지 내에서 보이고, 자식개체이면 다른 패키지라도 보임
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
