package atcw_20161129;

public class Quiz {
	private int score;
	private int lives;
	Quiz(int x){
		score = x;
	}
	int setScore(int x){
		score = x;
		return score;
	}
	int getScore(){
		return score;
	}
	/*
	 * void setScore(int x) {
	 * 	 score = x;
	 * }
	 */
}
