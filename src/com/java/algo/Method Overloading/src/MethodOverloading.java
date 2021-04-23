
public class MethodOverloading {
	public static void main(String[] args) {

		int calculateScore = calculateScore("Pankaj kumar", 70);
		System.out.println("Points = " + calculateScore);
		calculateScore(50);
	}

	public static int calculateScore(String playerName, int score) {

		System.out.println("Player name : " + playerName + " score : " + score + " points ");
		return score * 1000;
	}

	public static int calculateScore(int score) {

		System.out.println("Unnamed Player name  score : " + score + " points ");
		return score * 1000;
	}
}
