package LogicalOROperator.src;

public class MainRunner {
	public static void main(String[] args) {

		int myScore = 75;

		int topper = 98;

		if (myScore < 40) {
			System.out.println("i got pass marks = " + myScore);
		}
		if (myScore < topper) {
			System.out.println("I have less marks than Topper ");
		}
		if ((myScore > 40) || (topper > 40)) {
			System.out.println(" Either or we both got pas marks");
		}
	}
}
