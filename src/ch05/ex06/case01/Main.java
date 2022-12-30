package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
		// Man.tell("");  // 불가능
		
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello.");  // 가능은 하지만 왠만하면...
	}
}