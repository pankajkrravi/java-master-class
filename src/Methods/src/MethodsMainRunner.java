package Methods.src;

public class MethodsMainRunner {
	public static void main(String[] args) {
		// boolean gameOver=true;
		// int score=300;
		// int levelCompleted=3;
		// int bonu=200;
		//calculateScore(true, 500, 6, 100);// pass arg to method
		 int calculateScore = calculateScore(true, 400, 4, 200);
		 System.out.println("Your final score = " + calculateScore);
		
	}

	/*public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 100;
			System.out.println("Your final score = " + finalScore);
		} */
		public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
			if (gameOver) {
				int finalScore = score + (levelCompleted * bonus);
				finalScore += 100;
				return finalScore;
			}   //else {
				//return -1;
			    //}
		return -1;
	}
}
