package CodeBlocks.src;

public class CodeBlocks_IfBlock {
	public static void main(String[] args) {

		int myScore = 300;
		if (myScore == 500) // code block is not added { }
			System.out.println("Your score is 500");
		System.out.println("Next line Added to test");
		if (myScore == 300) {
			System.out.println(" Your score is 300");
		}else {
			System.out.println(" Else Block ...");
		}
	}
}
