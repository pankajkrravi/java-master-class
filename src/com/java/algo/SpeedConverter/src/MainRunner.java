
public class MainRunner {
	public static void main(String[] args) {
		double milesPerHour = SpeedConverter.toMilesPerHour(10.5);
		System.out.println("miles/hour= " + milesPerHour);
		SpeedConverter.PrintConversion(10.5);
	}
}
