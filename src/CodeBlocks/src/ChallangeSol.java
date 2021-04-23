package CodeBlocks.src;
public class ChallangeSol {
	public static void main(String[] args) {

		boolean newameover = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		if (newameover) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final bonus = " + finalScore);
		}
	}
}
