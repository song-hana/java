package ch05.home.ex05.case08_answer;

public class Player {
	private String playerName;
	
	public Ball pass(Ball ball) {
		return ball;
	}
	
	public Ball kick(Ball ball) {
		return ball;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}