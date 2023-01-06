package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	/*  // 점수 임의 배정
	public void play() {
		Score[] scores = new Score[5];
		
		for(int i = 0; i < scores.length; i++)
			scoreService.addScore(
					scores[i] = new Score((i + 1) * 10, (i + 1) * 10, (i + 1) * 10));
		
		scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}
	*/
	
	// 과제: 5명의 국, 영, 수 점수를 user가 입력토록 하라.
	//		 interface Console을 만든다.
	/*  // 내 과제
	public void play() {
		Score[] scores = new Score[5];
		
		for(int i = 0; i < scores.length; i++) {
			Console.info((i + 1) + "번째 학생의 성적을 입력하세요.");
			
			scoreService.addScore(scores[i] = new Score(
					Console.inInt("국어 성적"),
					Console.inInt("영어 성적"),
					Console.inInt("수학 성적")
					));
		scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
		}
	}	
	*/
	
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
	}
}
