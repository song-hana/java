package ch08.ex02.case04;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL;
	
	public static Job valueOf(int ordinal) {
		return values()[ordinal];
	}
}
