package LogicalOROperator.src;
public class AssignmentVSEqualto {
	public static void main(String[] args) {

		int num = 225;
		// if (num = 24) {
		// System.out.println("Aggignment operator ");
		// }
		if (num == 25) {
			System.out.println("Equal to operator");
		}

		boolean mychar = false;

		if (mychar = true) {
			System.out.println(" This code should not be executed....");
		}
		if (!mychar) {
			System.out.println("Not operator .....");
		}
	}
}
