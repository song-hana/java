package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuseday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "firday";
		case 7 -> "satureday";
		default -> "none";
		};
		
		System.out.println(dayName);
	}
}
