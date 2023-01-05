package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		/*
		int max = 0;
		int min = 0;
		
		for(int score: scores) if(max < score) max = score;
		min = max;
		for(int score: scores) if(min > score) min = score;
		*/
		
		int max = scores[0];
		int min = scores[0];
		
		for(int score: scores) {
			if(score > max) max = score;
			if(score < min) min = score;
		}
		
		
		System.out.printf("%d %d", max, min);
	}
}

/*
과제: scores 에서 최고, 최소값을 찾아라.
*/