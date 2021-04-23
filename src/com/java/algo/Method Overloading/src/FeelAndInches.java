
public class FeelAndInches {
	public static void main(String[] args) {
		calFeetAndInches(6, 0);
		calFeetAndInches(7, 5);
		calFeetAndInches(-10, 0);
		calFeetAndInches(1, 1);
		calFeetAndInches(100);
	}

	public static double calFeetAndInches(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) && (inches > 12))) {
			System.out.println("Invalid feet || inches");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet " + inches + " inches " + centimeters + " centimeters ");
		return centimeters;
	}

	public static double calFeetAndInches(double inches) {
		if (inches < 0)
			return -1;

		double feet = (int) inches / 12;
		double remaningInInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remaningInInches + " inches ");
		return calFeetAndInches(feet, inches);
	}
}
