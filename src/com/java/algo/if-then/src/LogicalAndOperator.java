
public class LogicalAndOperator {

	public static void main(String[] args) {

		int myScore = 75;

		int topper = 98;

		if (myScore < 40) {
			System.out.println("i got pass marks = " + myScore);
		} else if (myScore < topper) {
			System.out.println("I have less marks than Topper ");
		} else if (myScore > 40 && topper > 40) {
			System.out.println(" we both got pas marks");
		}
	}
}
