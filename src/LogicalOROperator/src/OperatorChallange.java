package LogicalOROperator.src;

public class OperatorChallange {
	public static void main(String[] args) {

		double var1 = 20.00d;
		double var2 = 80.00d;

		double result1 = (var1 + var2) * 100.00;
		System.out.println("My value =" + result1);
		double reminder = result1 % 40.00d;
		System.out.println("Reminder = " + reminder);

		boolean check = true;
		boolean isNoReminde = (reminder == 0) ? true : false;
		System.out.println("IsNiReminder + " +isNoReminde);
		if (!isNoReminde) {
			System.out.println("Resultant reminser is not zero !!");
		}
	}
}
