package Methods.src;
public class MethodChallange {

	public static void main(String[] args) {
		int calculateHighScorePosition = calculateHighScorePosition(1500);
		displayHighScoreposition("Pankaj kumar", calculateHighScorePosition);
		int calculateHighScorePosition2 = calculateHighScorePosition(900);
		displayHighScoreposition("Neeraj kumar", calculateHighScorePosition2);
		int calculateHighScorePosition3 = calculateHighScorePosition(400);
		displayHighScoreposition("Anushree Dey ", calculateHighScorePosition3);
		int calculateHighScorePosition4 = calculateHighScorePosition(50);
		displayHighScoreposition("Sanjeev kumar", calculateHighScorePosition4);
	}

	public static void displayHighScoreposition(String playersName, int position) {
		// playersName +"Managed to position";
		System.out.println(playersName + " managed to get into position " + position + " on the high score table");

	}

	public static int calculateHighScorePosition(int playerScore) {

		/*
		 * if (playerScore >=1000) { return 1; } if (playerScore >= 500) { return 2; }
		 * if (playerScore >=100) { return 3; } return 4;
		 */
		int position = 4;
		if (playerScore >= 1000)
			return 1;
		if (playerScore >= 500)
			return 2;
		if (playerScore >= 100)
			return 3;
		return position;
	}
}
